public class DecimalNumber {

    long integerPart;
    long decimalPart;

    public DecimalNumber(double n){
        String s = String.valueOf(n);
        String[] ss = s.split("\\.");
        integerPart = Long.parseLong(ss[0]);
        decimalPart = Long.parseLong(ss[1]);
    }

    public double getValue(){
        return Double.parseDouble(integerPart + "." + decimalPart);
    }

}
