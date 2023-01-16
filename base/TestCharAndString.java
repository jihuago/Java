package base;

public class TestCharAndString {
    public static void main(String[] args) {
        // 字符类型 char
        // 字符串类型 string

        // 一个 char 保存一个 Unicode 字符
        char c1 = 'A';
        char c2 = '中';

        // 因为 Java 在内存中使用 Unicode 表示字符。所以一个英文字符和一个中文字符都用一个 char 类型表示，它们都占用
        // 两个字节. 要显示一个字符的Unicode 编码，只需将 char 类型赋值给 int 类型即可
        int i1 = 'A';
        System.out.println(i1);

        // 字符串连接
        // 使用 + 进行链接字符串和其他类型
        String s1 = "this is ";
        String finalStr = s1 + "a test";
        System.out.println(finalStr);

        // 如果用 + 连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接
        int age = 28;
        String personalIntroduce = "age is " + age;
        System.out.println(personalIntroduce);

        // 多行字符串
        String multiLineStr = "first line \n"
                + "second line \n"
                + "end";
        System.out.println(multiLineStr);

        // 字符串不可变特性
        // Java 的字符串除了是一个引用类型外，还有个重要的特点，就是字符串不可变。
        // 字符串的不可变是指字符串内容不可变。
    }
}
