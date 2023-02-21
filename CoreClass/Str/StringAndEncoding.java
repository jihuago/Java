package CoreClass.Str;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @ClassName StringAndEncoding
 * @Description 字符串和编码
 *  1. 在 Java 中， String 是一个引用类型，本身也是一个 class
 *  2. Java 字符串一个重要特点就是字符串不可变，通过内部的 private final char[]，以及没有任何修改的 char[] 的方法实现的
 * @Author 梁芝
 * @Date 2023/1/30 上午10:51
 * @Version 1.0
 **/
public class StringAndEncoding {
    public static void run() {
        String str = "Hello";
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);

        // 字符串比较
        // 字符串比较是否相同，必须使用 equals() 方法
        boolean compareRes = str.equals("HELLO2");
        System.out.println(compareRes);

        // 分隔字符串
        String s = "A,B,C,D";
        String[] arr = s.split(",");
        System.out.println(Arrays.toString(arr));

        // 类型转换
        // 其他类型转换为字符串
        String s1 = String.valueOf(123);

        // === 字符编码
        // char 类型就是两个字节的 Unicode 编码

        // 按 utf-8 编码转换
        byte[] b1 = "Hello".getBytes(StandardCharsets.UTF_8);
    }
}