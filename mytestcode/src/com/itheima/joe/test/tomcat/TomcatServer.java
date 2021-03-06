package com.itheima.joe.test.tomcat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.StringTokenizer;

public class TomcatServer {

    private final static int PORT = 8080;

    public static void main(String[] args) {

        try {
            //根据端口号启动一个serverSocket
            ServerSocket server = new ServerSocket(PORT);
            ServletHandler servletHandler = new ServletHandler(server);
            servletHandler.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static class ServletHandler extends Thread {
        ServerSocket server;

        ServletHandler(ServerSocket server) {
            this.server = server;
        }


        @Override
        public void run() {
            while (true) {
                try {
                    Socket client;
                    //ServerSocket阻塞等待客户端请求数据
                    client = server.accept();
                    if (client != null) {
                        try {
                            System.out.println("接收到一个客户端的请求");

                            //根据客户端的Socket对象获取输入流对象。
                            //封装字节流到字符流
                            BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

                            // GET /test.jpg /HTTP1.1
                            //http请求由三部分组成，分别是：请求行、消息报头、请求正文。
                            //这里取的第一行数据就是请求行。http协议详解可以参考http://www.cnblogs.com/li0803/archive/2008/11/03/1324746.html说的很详细
                            String line = reader.readLine();

                            System.out.println("line: " + line);

                            //拆分http请求路径，取http需要请求的资源完整路径
                            String resource = line.substring(line.indexOf('/'), line.lastIndexOf('/') - 5);

                            System.out.println("the resource you request is: " + resource);

                            resource = URLDecoder.decode(resource, "UTF-8");
                            System.out.println(resource);

                            //获取到这次请求的方法类型，比如get或post请求
                            String method = new StringTokenizer(line).nextElement().toString();

                            System.out.println("the request method you send is: " + method);

                            //继续循环读取浏览器客户端发出的一行一行的数据
                            while ((line = reader.readLine()) != null) {
                                //当line等于空行的时候标志Header消息结束
                                if ("".equals(line)) {
                                    break;
                                }
                                System.out.println("the Http Header is : " + line);
                            }

                            //如果是POST的请求，直接打印POST提交上来的数据
                            if ("post".equals(method.toLowerCase())) {
                                System.out.println("the post request body is: "
                                        + reader.readLine());
                            } else if ("get".equals(method.toLowerCase())) {
                                //判断是get类型的http请求处理
                                //根据http请求的资源后缀名来确定返回数据

                                //比如下载一个图片文件，我这里直接给定一个图片路径来模拟下载的情况
                                if (resource.endsWith(".jpg")) {
                                    transferFileHandle("d://123.jpg", client);
                                    closeSocket(client);
                                } else {

                                    //直接返回一个网页数据
                                    //其实就是将html的代码以字节流的形式写到IO中反馈给客户端浏览器。
                                    //浏览器会根据http报文“Content-Type”来知道反馈给浏览器的数据是什么格式的，并进行什么样的处理

                                    PrintStream writer = new PrintStream(client.getOutputStream(), true);
                                    // 返回应答消息,并结束应答
                                    writer.println("HTTP/1.0 200 OK");
                                    //响应头 返回的字符内内容是charset=utf-8;
                                    writer.println("Content-Type:text/html;charset=utf-8");
                                    writer.println();
                                    //writer.println("Content-Length:" + html.getBytes().length);// 返回内容字节数
                                    writer.println("<html><body>");
                                    writer.println("<a href='www.baidu.com'>百度</a>");
                                    writer.println("<img src='https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png'></img>");
                                    writer.println("您输入错误了");
                                    writer.println("</html></body>");


                                    //writer.println("HTTP/1.0 404 Not found");// 返回应答消息,并结束应答
                                    writer.println();// 根据 HTTP 协议, 空行将结束头信息
                                    writer.close();
                                    //请求资源处理完毕，关闭socket链接
                                    closeSocket(client);
                                }
                            }


                        } catch (Exception e) {
                            System.out.println("HTTP服务器错误:"
                                    + e.getLocalizedMessage());
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        private void closeSocket(Socket socket) {
            try {
                socket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            System.out.println(socket + "离开了HTTP服务器");
        }

        private void transferFileHandle(String path, Socket client) {

            File fileToSend = new File(path);

            if (fileToSend.exists() && !fileToSend.isDirectory()) {
                try {
                    //根据Socket获取输出流对象，将访问的资源数据写入到输出流中
                    PrintStream writer = new PrintStream(client.getOutputStream());
                    // 返回应答消息,并结束应答
                    writer.println("HTTP/1.0 200 OK");
                    writer.println("Content-Type:application/binary");
                    // 返回内容字节数
                    writer.println("Content-Length:" + fileToSend.length());
                    // 根据 HTTP 协议, 空行将结束头信息
                    writer.println();

                    FileInputStream fis = new FileInputStream(fileToSend);
                    byte[] buf = new byte[fis.available()];
                    int len;
                    while ((len = fis.read(buf)) != -1) {
                        writer.write(buf, 0, len);
                    }
                    client.shutdownOutput();
                    writer.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

