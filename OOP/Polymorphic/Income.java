package OOP.Polymorphic;

/**
 * @ClassName Income
 * @Description TODO
 * @Author 梁芝
 * @Date 2023/1/29 下午3:52
 * @Version 1.0
 **/
public class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1;
    }

}