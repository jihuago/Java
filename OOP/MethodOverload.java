package OOP;

/**
 * @ClassName MethodOverload
 * @Description 在一个类中，可以定义多个同名方法。功能类似，只有参数有所不同。
 * @Author 梁芝
 * @Date 2023/1/29 下午12:28
 * @Version 1.0
 **/
public class MethodOverload {
    public static void main(String[] args) {

        // 方法重载是指多个方法的方法名相同，但各自的参数不同
        // 重载方法应完成类似的功能，参考 String 的 indexOf()
        // 重载方法返回值类型应该相同

        String s = "Test string";
        int n1 = s.indexOf('a');
        System.out.println(n1);

        int n2 = s.indexOf("st");
        System.out.println(n2);

    }

    public String sayHi() {
        return "hi";
    }

    public String sayHi(int age) {
        return "age is :" + age;
    }

}