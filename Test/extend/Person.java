package Test.extend;

/**
 * @ClassName Person
 * @Author ζ’θ
 * @Date 2023/1/29 δΈε2:55
 * @Version 1.0
 **/
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println("Person.run");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}