package base;

/**
 * @ClassName JavaBase
 * @Description Java 程序基础
 * @Author 梁芝
 * @Date 2023/1/11 下午4:38
 * @Version 1.0
 **/
public class JavaBase {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        // 类名必须英文字母开头，后街字母，数字和下划线
        // 习惯以大写字母开头
        // Java 入口程序规定的方法必须是静态方法，方法名必须为 main，括号内的参数必须是 String 数组

        learnVariable();
    }


    protected static void learnVariable() {
        // Java 定义了以下几种基本数据类型
        // 整数类型： byte, short, int, long
        // 浮点数类型： float， double
        // 字符类型： char
        // 布尔类型: boolean
        // byte 1个字节; short 2个字节; int 4个字节; long 8个字节; float 4个字节; double 8个字节; char 2个字节

        // 定义整型
        int i = 2_000_00;
        int i1 = 0b01;
        System.out.println(i);
        System.out.println(i1);
        // long 型的结尾需要加L
        long l = 90000L;
        System.out.println(l);

        // 浮点型

        // 浮点型需要加上后缀 f
        float f1 = 1.2f;
        // 科学计数法表示
        float f2 = 3.14e35f;
        // double 类型定义
        double d = 1.79e308;

        //========================
        // 布尔类型: boolean 只有 true 和 false 两个值
        // Java 语言对布尔类型的存储没有做规定，理论上存储布尔类型只需要 1 bit，
        boolean b1 = true;
        boolean isGreater = 5 > 3;
        System.out.println(isGreater);

        //========================
        // 字符类型： 字符类型 char 表示一个字符。 Java 的 char 类型除了可表示标准的 ASCII 外，还可以表示一个 Unicode 字符
        // char 类型使用单引号，且仅有一个字符，要和双引号 " 的字符串类型区分开
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);

    }
}