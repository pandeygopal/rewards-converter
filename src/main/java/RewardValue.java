public class RewardValue {
    double cashValue;
    double MilesValue;
    private final double rate=0.0035;

    public  RewardValue(int milesValue) {
        MilesValue = milesValue;
        cashValue=MilesValue*rate;
    }
    public RewardValue(double cashValue) {
       this.cashValue = cashValue;
        MilesValue=(int)(cashValue/rate);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return MilesValue;
    }
    //Done
}
