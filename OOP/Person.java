package OOP;

/**
 * @ClassName Person
 * @Description TODO
 * @Author 梁芝
 * @Date 2023/1/29 下午2:21
 * @Version 1.0
 **/
class Person {
    private String[] name;
    private String names;
    protected int age = 1;

    // 默认的构造方法
    public Person() {

    }

    // 构造方法，构造方法和类名一致。构造方法没有返回值，也没有 void
    public Person(String name, int age) {
        this.names = name;
        this.age = age;
    }

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }

}