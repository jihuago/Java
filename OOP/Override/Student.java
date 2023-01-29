package OOP.Override;


import Test.extend.Person;

import java.util.Arrays;

/**
 * @ClassName Student
 * @Description 多态
 *  1. 在继承关系中，子类如果定义了一个与父类方法签名完全相同的方法，被称为覆写(Override)
 *  2. 多态： Java 的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
 *      这个非常重要的特性在面向对象编程中称之为多态。
 *        public void runTwice(Person p) {
 *            p.run();
 *            p.run();
 *        }
 *       多态的特性就是：运行期才能动态决定调用的子类方法.
 * @Author 梁芝
 * @Date 2023/1/29 下午3:00
 * @Version 1.0
 **/
public class Student extends Person {
    public Student() {
        super("jack", 12);
    }

    // 加上 @Override 可以让编译器帮助检查是否进行了正确的覆写。希望进行覆写，但不小心写错了方法签名，编译器会报错
    // 但是 @Override 不是必需的
    @Override
    public void run() {
        System.out.println("Student.run");
        testVar("a", 2, 3);
    }

    // int ...age 可变长度参数列表
    // 可变长度参数列表这个参数必须是参数列表中的最后一个参数，不然会报错
    public void testVar(String height, int ...age) {
        System.out.println(Arrays.toString(age));
    }
}