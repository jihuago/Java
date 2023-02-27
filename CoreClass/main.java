package CoreClass;

import CoreClass.Str.StringAndEncoding;
import CoreClass.fanxing.GenericParadigm;
import base.Reflect;

/**
 * @ClassName main
 * @Description 核心类
 * @Author 梁芝
 * @Date 2023/1/30 上午10:47
 * @Version 1.0
 **/
public class main {
    public static void main(String[] args) {
        System.out.println(12333);
        String str = test();
        System.out.println(str);
        StringAndEncoding.run();

        // 调用反射
        Reflect.run();
        GenericParadigm.run();
    }

    public static String test() {
        return "this is a test";
    }
}