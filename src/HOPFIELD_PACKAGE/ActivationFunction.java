package HOPFIELD_PACKAGE;

public class ActivationFunction {

    public static int stepFunction(double x){
        if(x >= 0) return 1;
        return -1;
    }
}
