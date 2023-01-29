package OOP.Abstract;

/**
 * @ClassName LearnInterface
 * @Description 接口
 * 1. 一般来说，公共逻辑适合放在 abstract class中，具体逻辑放到各个子类。而接口层次代表抽象程度
 * 2. Interface 可以 implements 多个 interface
 *      Interface 不能定义实例字段
 *      可以定义抽象方法
 *      可以定义 default 方法
 *          default 方法的目的是：当需要给接口新增一个方法时，会涉及到修改全部子类。
 *          如果新增的是 default 方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法.
 * @Author 梁芝
 * @Date 2023/1/29 下午5:40
 * @Version 1.0
 **/
interface LearnInterface {
    void run();
    String getName();
    default void test() {
        System.out.println(getName() + " run");
    }
}