package chap20_lambda.clazz;

import java.util.Scanner;

public class FourOpCalc {
    public  int calc(int a, int b, char op, FourOperation fo){
        int result = fo.operate(a, b);
        return result;
    }
}
