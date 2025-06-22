public class FutureValue {
    private double pastValue;
    private double growthRate;
    private int numberOfPeriods;
    public double CalculateFutureValue(double pastValue, double growthRate, int numberOfPeriods){
        if(pastValue < 0){
            throw new IllegalArgumentException("PastValue cannot be negative");
        }
        if(growthRate < -1.0){
            throw  new IllegalArgumentException("Growth rate cannot be less than -1.0");
        }
        if(numberOfPeriods < 0){
            throw new IllegalArgumentException("Number Of Years Cannot be negative");
        }
        if(numberOfPeriods == 0){
            return pastValue;
        }
        double PreviousPeriodValue = CalculateFutureValue(pastValue,growthRate, numberOfPeriods - 1);
        double futureValue = PreviousPeriodValue * ( 1 + growthRate);
        System.out.println("After "+ numberOfPeriods +" periods: "+String.format("%.2f", futureValue));
        return futureValue;
    }

}
