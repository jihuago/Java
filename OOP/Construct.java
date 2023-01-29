package OOP;

/**
 * @ClassName Construct
 * @Description 如果既能使用带参数的构造方法，又想保留不带参数的构造方法，只能把两个构造方法都定义出来
 * @Author 梁芝
 * @Date 2023/1/29 下午12:14
 * @Version 1.0
 **/
public class Construct {
    public static void main(String[] args) {
        Human h = new Human("mary", 18);
        System.out.println(h.getName());
    }
}

class Human {
    // 没有在构造方法中初始化字段时，引用类型的字段默认值是 null，数值类型的字段用默认值，int 类型默认 0，布尔类型默认 false
    private String name;
    private int age;
    // 不带参数的构造方法
    public Human() {
        System.out.println("构造方法1");
    }

    // 带参数的构造方法
    public Human(String name, int age) {
        // 一个构造方法可以调用其他构造方法，这样做的目的是便于代码复用。调用其他构造方法的语法是 this(..);
        this();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return  this.age;
    }

}