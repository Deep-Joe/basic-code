package com.itheima.joe.test.test01;

public class Test01 {
    /*
    第二题：分析以下需求，并用代码实现




	5.编写测试类分别对上述3类具体人物进行测试。

	6.要求运行结果:
		学生需要学习!
		工人的工作是盖房子!
		学生干部喜欢开会!
     */
    public static void main(String[] args) {
        Student student = new Student();
        Worker worker = new Worker();
        StudentLeader studentLeader = new StudentLeader();
        student.work();
        worker.work();
        studentLeader.meeting();
    }
}
