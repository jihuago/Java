package OOP;

/**
 * @ClassName Book
 * @Description 区分继承和组合
 *  1. 在使用继承时，要注意逻辑一致性
 *      如 Student 类继承 Book 类就不合适。
 *      Student 与 Book 是 has 关系，具有 has 关系不能使用继承，而是使用组合
 * @Author 梁芝
 * @Date 2023/1/29 下午2:47
 * @Version 1.0
 **/
public class Book {
    protected String name;
    public String getName() {
        return this.name;
    }
}