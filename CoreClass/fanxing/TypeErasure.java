package CoreClass.fanxing;

/**
 * @ClassName TypeErasure
 * @Description 擦拭法
 *   1. Java 语言的泛型实现方法是擦拭法 (Type Erasure)
 *      所谓擦拭法是：虚拟机对泛型其实一无所知，所有的工作都是编译器做的。
 *      Java 的泛型是由编译器在编译时实行的，编译器内部永远把所有类型 T 视为 Object 处理，但是，在需要转型的时候，编译器会根据 T 的类型自动为我们
 *      实行安全地强制转型
 * @Author liangzhi
 * @Date 2023/2/24 下午3:31
 * @Version 1.0
 **/
public class TypeErasure {
    public static void run() {
        // Java 泛型的局限
        // 1. <T> 不能是基本类型，例如 int，因为实际类型是 Object， Object 类型无法持有基本类型
//        Pair<Integer, boolean> p = new Pair<int, boolean>(1, true); // compile error

        // 2. 无法取得带泛型的 Class
        Pair<String, String> p = new Pair<>("jack", "mary");
        Pair<String, Integer> p1 = new Pair<>("name" ,18);
        // 所有泛型实例，无论 T 的类型是什么， getClass() 返回同一个 Class 实例，因为编译后他们全部都是 Pair<Object, Object>
        Class c1 = p.getClass();
        Class c2 = p1.getClass();

        System.out.println(c1 == c2);
    }
}