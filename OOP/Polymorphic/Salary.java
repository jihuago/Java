package OOP.Polymorphic;

/**
 * @ClassName Salary
 * @Description TODO
 * @Author 梁芝
 * @Date 2023/1/29 下午4:06
 * @Version 1.0
 **/
public class Salary extends Income {

    private double baseIncome = 5000;

    public Salary(double income) {
        super(income);
    }

    public double getTax() {
        if (this.income <= this.baseIncome) {
            return 0;
        }

        return (this.income - 5000) * 0.2;
    }

}