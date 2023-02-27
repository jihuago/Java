package CoreClass.fanxing;

/**
 * @ClassName Pair
 * @Description 编写泛型类
 *  1. 编写泛型类比普通类要复杂。通常，泛型类一般用在集合类中，例如 ArrayList<T>
 *  2. 泛型定义多种类型
 *      public class Pair<T, K>
 *          Java 标准库 Map<K, V> 就是使用两种泛型类型的例子
 * @Author 梁芝
 * @Date 2023/2/24 下午3:20
 * @Version 1.0
 **/
public class Pair<T, A> {
    private T first;
    private A last;

    public Pair(T first, A last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return this.first;
    }

    public A getLast() {
        return this.last;
    }

}