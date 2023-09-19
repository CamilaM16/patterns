package adapter;

public class Tax {
    private double tax;
    private double result;

    public Tax(double tax, double result) {
        this.tax = tax;
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public double getTax() {
        return tax;
    }


    public String toString (){
        return "{ tax: "+tax+", result: "+result+" }";
    }
}
