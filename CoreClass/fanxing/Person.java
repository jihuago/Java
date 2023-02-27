package CoreClass.fanxing;

/**
 * @ClassName Person
 * @Description 泛型接口
 * 该类可以使用 Arrays.sort() 进行排序，所以 Person 类实现 Comparable<T> 这个泛型接口
 *
 * @Author 梁芝
 * @Date 2023/2/24 下午2:33
 * @Version 1.0
 **/
public class Person implements Comparable<Person> {
    public String name;
    public int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }

    public String toString() {
        return this.name + "," + this.score;
    }

}