package base;

public class TestFloat {
    public static void main(String[] args) {
        testFloat();
    }

    public static void testFloat() {
        // 溢出
        // 整数运算在除数为0的时会报错，而浮点数在除数为0，不会报错，但会返回几个特殊值
        // NaN 表示 Not a Number
        // Infinity 表示无穷大
        // -Infinity 表示负无穷大
        double i = 1.1 / 0;
        System.out.println(i);

        // 由于浮点数存在运算误差，所以比较两个浮点数是否相等常常会出现错误的结果。
        // 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数
        double x = 1.2;
        double y = 1.2000001;
        double r = Math.abs(x - y);
        if (r < 0.00001) {
            System.out.println("equal.");
        } else {
            System.out.println("not equal.");
        }

        double n = 5.0 / 0;
        // 四舍五入
        double d = 2.6;
        int n1 = (int) (d + 0.5);
        System.out.println(n1);

        boolean yes = true;
        char res = yes ? 'a' : 'b';
        System.out.println(res);

    }
}
