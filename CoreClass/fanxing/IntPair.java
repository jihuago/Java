package CoreClass.fanxing;

/**
 * @ClassName IntPair
 * @Description 泛型继承
 * 1. 一个类可以继承自一个泛型类
 * @Author liangzhi
 * @Date 2023/2/24 下午4:24
 * @Version 1.0
 **/
public class IntPair extends Pair<String, Integer> {
    public IntPair() {
        super("a", 1);
    }
}