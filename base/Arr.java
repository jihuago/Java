package base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName Arr
 * @Description TODO
 * @Author 梁芝
 * @Date 2023/1/29 上午9:39
 * @Version 1.0
 **/
public class Arr {
    // main() 方法接收一个命令行参数，是一个 String[] 数组
    public static void main(String[] args) {
        // 数组操作

        // for 循环打印
        String[] names = {"jack", "mary", "mark"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // for each 循环打印数组
        char[] nameAbbreviation = {'A', 'B', 'C'};
        for (char abbr : nameAbbreviation) {
            System.out.println(abbr);
        }

        // Arrays.toString() 快速打印数组内容
        int[] ns = {1, 1, 2, 3, 5, 8};
        System.out.println(Arrays.toString(ns));

        eachArr(ns);
        sortArr();
        multiArr();

    }

    /**
     * @Author 梁芝
     * @Description 倒叙遍历数组并打印每个元素
     * @Date 上午9:52 2023/1/29
     * @param  void
     *
     * @Return void
     */
    public static void eachArr(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void sortArr() {
        // JDK 提供的 Arrays.sort() 升序排序
        int[] arr = {1, 8, 2, 9, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = {1, 9, 2, 7};
        // -1 -9 -2 -7 => -9 -7 -2 -1
        // 降序排序， Collections 类
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));

        // 先利用
        int[] arr2 = {1, 9, 2, 7};
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] *= -1;
        }
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] *= -1;
        }

        System.out.println(Arrays.toString(arr2));


    }

    // 二维数组
    public static void multiArr() {
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6}
        };

        // Arrays.deepToString()
        System.out.println(Arrays.deepToString(ns));

    }

}