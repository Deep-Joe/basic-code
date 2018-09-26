package com.itheima.joe.test.tomcat.tomcat2;

/**
 * //格式：协议：//主机号：端口号/目录路径/文件名
 //例如： http：//127.0.0.1:8080/Test/Manage/index.jsp?a=1&b=2
 */
public class UrlBean {
    private String protocol;
    private String host;
    private String port;
    private String path;
    private String fileName;
    private String parameter;

    public UrlBean(String protocol, String host, String port, String path,
                   String fileName, String parameter) {
        super();
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.fileName = fileName;
        this.parameter = parameter;
    }

    public UrlBean() {
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
}

