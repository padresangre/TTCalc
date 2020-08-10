package Calc;

public class CalcLogic {

    public static String CL(int num1, int num2, String oper) {
        String result = "";
        switch (oper){
            case "*":
                result = String.valueOf(num1*num2);
                break;
            case "/":
                if (num2==0){
                    throw new ArithmeticException("На 0 делить нельзя");
                }
                result = String.valueOf(num1/num2);
                break;
            case "+":
                result = String.valueOf(num1+num2);
                break;
            case "-":
                result = String.valueOf(num1-num2);
                break;
        }
       return result;
    }
}
