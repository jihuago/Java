package OOP.Abstract;

/**
 * @ClassName LearnAbstract
 * @Description 抽象类相关
 *  1. 面向抽象编程
 *      * 尽量引用高层类型，避免引用实际子类型的方式
 *  2. 面向抽象编程的本质
 *      * 上层代码只定义规范
 *      * 不需要子类就可以实现业务逻辑（正常编译）
 *      * 具体的业务逻辑由不同的子类实现，调用者并不关心
 * @Author 梁芝
 * @Date 2023/1/29 下午5:25
 * @Version 1.0
 **/
abstract public class LearnAbstract {
    public abstract void run();


}