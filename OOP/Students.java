package OOP;

/**
 * @ClassName Students
 * @Description 继承
 * 1. 没有明确写 extends 的类，编译器会自动加上 extends Object
 *      所以，任何类，除了 Object，都会继承自某个类
 * 2. Java 只允许一个 class 继承自一个类，因此，一个类有且仅有一个父类。只有 Object特殊，它没有父类
 * 3. super 关键字表示父类
 *      子类引用父类的字段： super.fileldName
 * 4. 如果父类没有默认的构造方法，子类就必须显式调用 super()
 *      引出一个问题：子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的
 * @Author 梁芝
 * @Date 2023/1/29 下午2:22
 * @Version 1.0
 **/
public class Students extends Person {

    // 使用组合，即 Student 可以持有一个 Book 实例
    protected Book book;

    public Students() {
        // super() 调用父类的构造方法
//        super("继承", 12);
        int age = super.age;
        System.out.println("My age:" + age);
    }
}