package base;


public class Hello {
    public static void main(String[] args) {
        testInt();
    }


    public static void testInt() {
        // 在 Java 8 中，Integer 缓存池的大小默认为 - 128 ~ 127
        Integer int1 = 100;
        Integer int2 = 100;
        System.out.println(int1 == int2);

        // 300 在 Integer 缓存池之外
        Integer int3 = 300;
        Integer int4 = 300;
        System.out.println(int3 == int4);
    }


    public static void testString(String[] phone) {

    }
}
