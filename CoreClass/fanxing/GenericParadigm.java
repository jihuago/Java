package CoreClass.fanxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName GenericParadigm
 * @Description 泛型是一种“代码模板”，可以用一套代码套用各种类型
 * 1. 泛型就是定义一种模板，例如 ArrayList<T>  T 可以是任何类型
 * 2. 泛型的好处是使用时不必对类型进行强制转换，它通过编译器对类型进行检查
 * @Author 梁芝
 * @Date 2023/2/24 上午11:49
 * @Version 1.0
 **/
public class GenericParadigm {
    public static void run() {
        ArrayList list = new ArrayList();
        list.add("Hello2");
        String str = (String) list.get(0);
        System.out.println(str);

        // 使用泛型
        // 只能保存String 类型到 strList
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("hello,泛型");
        String s1 = strList.get(0);
        System.out.println(s1);

        String[] arr = new String[] {"a", "d"};
        Arrays.sort(arr);

        Person[] ps = new Person[] {
                new Person("Bob", 61),
                new Person("Alice", 88)
        };
        // 因为 Person 实现了 Comparable<String> 接口，所以可以使用 sort() 排序
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));

        // 使用自定义泛型
        Pair<String, Integer> p = new Pair<>("test", 1);
        Integer i = p.getLast();
        System.out.println(i);

        TypeErasure.run();

    }
}