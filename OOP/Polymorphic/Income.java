package OOP.Polymorphic;

/**
 * @ClassName Income
 * @Description TODO
 * @Author ζ’θ
 * @Date 2023/1/29 δΈε3:52
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