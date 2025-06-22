//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                FutureValue fValue = new FutureValue();
                double iniInvestment = 1000.00;
                double GrowthRate = 0.05;
                int years = 3;
                try{
                    double futureValue = fValue.CalculateFutureValue(iniInvestment,GrowthRate,years);
                    System.out.println("Future Value : "+ futureValue);
                }
                catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
    }
}