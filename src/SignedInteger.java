public class SignedInteger {

    int n;
    boolean isNegative;

    public SignedInteger(int n){
        isNegative = n < 0;
        this.n = Math.abs(n);
    }

    int getValue(){
        return isNegative ? -n : n;
    }

    void setValue(int n){
        isNegative = n < 0;
        this.n = Math.abs(n);
    }

    void addValue(int n){
        this.n += isNegative ? -n : n;
        if(this.n < 0){
            isNegative = !isNegative;
            this.n = Math.abs(this.n);
        }
    }

}


