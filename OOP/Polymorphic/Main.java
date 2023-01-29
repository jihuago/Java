package OOP.Polymorphic;

/**
 * @ClassName Main
 * @Description 多态的例子
 * @Author 梁芝
 * @Date 2023/1/29 下午3:48
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Income[] incomes = new Income[] {
                new Income(3000),
                new Salary(7500)
        };

        System.out.println(totalTax(incomes));

    }

    public static double totalTax(Income... incomes) {
        double total = 0;

        for (Income income : incomes) {
            total += income.getTax();
        }

        return total;
    }

}