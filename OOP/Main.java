package OOP;

import OOP.Override.Student;

/**
 * @ClassName Main
 * @Description TODO
 * @Author 梁芝
 * @Date 2023/1/29 上午11:39
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
        // 除了基本数据类型(整数类型，浮点数类型，字符类型，布尔类型)，其他的是引用类型
        // 引用类型参数的传递。调用方的变量，和接收方的参数变量，指向的是同一个对象

        Person p = new Person("jack", 12);
        String[] fullName = new String[] {"Homer", "Simpson"};
        p.setName(fullName);
        System.out.println(p.getName());
        // 引用类型参数的传递。调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对象。
        fullName[0] = "Bart";
        System.out.println(p.getName());

        MethodOverload methodLoad = new MethodOverload();
        String hiStr = methodLoad.sayHi(12);
        System.out.println(hiStr);

        new Students();

        System.out.println("===================================");
//        Test.extend.Person p1 = new Test.extend.Person("a", 1);
//        p1.run();
        Student stu = new Student();
        stu.run();

    }

}