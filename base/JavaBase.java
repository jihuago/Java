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
        learnIntOperation();
    }

    /**
     * @Author 梁芝
     * @Description 整数运算
     * @Date 下午5:56 2023/1/11
     *
     * @Return void
     */
    protected static void learnIntOperation() {
        // 整数的数值表示是精准的，而且整数运算永远是精准的，即使是除法也是精准的，以为两个整数相除只能得到结果的整数部分
        int x = 123 / 12;
        System.out.println(x);

        // 溢出
        // 整数由于存在范围限制，如果计算结果超出了范围，就会产生溢出，而溢出不会出错，却会得到一个奇怪的结果
        int i = 2147483640;
        int j = 15;
        int sum = i + j;
        // 解决这个问题：1. 使用 long 类型
        System.out.println(sum);

        long li = 214748364999L;
        System.out.println(getType(li));
        System.out.println(getType(i));

        //==============================
        // 类型自动提升与强制转型
        // 在运算过程中，如果参与运算的两个数类型不一致，那么计算结果为较大类型的类型。

    }

    /**
     * @Author 梁芝
     * @Description 浮点数运算
     * @Date 下午6:25 2023/1/11
     *
     * @Return void
     */
    protected static void learnFloatOperation() {
        // 浮点数运算：1. 只能进行加减乘除这些数值计算，不能做位运算和移位运算 2. 浮点数虽然表示的范围大，但是浮点数无法精准表示


    }

    public static String getType(Object o) {
        return o.getClass().toString();
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
        // 如果要定义一个超过 int 表达范围的值，则需要在末尾加上一个 L 起到标识作用
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
        // Java 语言对布尔类型的存储没有做规定，理论上存储布尔类型只需要 1 bit，但是通常 JVM 内部会把 boolean 表示为 4 字节整数
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

        // 引用类型
        // 除了基本类型的变量，剩下的都是引用类型。例如，引用类型最常用的就是 String 字符串
        // 引用类型的变量类型 C 语言的指针，内部存储一个地址，指向某个对象在内存的位置
        String s = "hello";
        System.out.println(s);

        // 常量
        // 定义变量的时候，加上 final 修饰符，这个变量就是常量
        // 常量的作用：用有意义的变量名来避免魔术数字，而是定义一个常量。如果将来需要提高计算精度，我只需要在常量的定义处修改。
        // 根据习惯，常量名通常全部大写。
        final double PI = 3.14;


    }
}