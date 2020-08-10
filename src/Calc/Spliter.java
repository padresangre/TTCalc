package Calc;



public class Spliter {
//    public static String[] splNum(String str){
//        String[] parts = str.split("[*/+-]");
//        return parts;
//    }

    public static String[] parts = Calc.input.split("[*/+-]");

    public static String num1 = parts[0];// первая часть ареф. выражения
    public static String num2 = parts[1]; // вторя часть ареф. выражения


    public static String op = Calc.input.substring(parts[0].length(),parts[0].length()+1); // знак операции

    public static String arabian() {
        int n1;
        int n2;
        String res ="";
        if (num1.matches("[0123456789]+")&&num2.matches("[0123456789]+")) {
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
//            String o = op;

            if (n1 > 10 || n2 > 10) {
                throw new IllegalArgumentException("Вводимые числа не должны быть больше 10(Х)");
            } else {
                res = CalcLogic.CL(n1, n2, op);
            }
        }else if(num1.matches("[ivxlcdmIVXLCDM]+")&&num2.matches("[ivxlcdmIVXLCDM]+")) {
            n1 = RomanNum.romanToArabic(num1);
            n2 = RomanNum.romanToArabic(num2);
            if (n1 > 10 || n2 > 10) {
                throw new IllegalArgumentException("Вводимые числа не должны быть больше 10(Х)");
            } else {
                res = RomanNum.arabicToRoman(Integer.parseInt(CalcLogic.CL(n1, n2, op)));
            }
        }else{
            throw new IllegalArgumentException("Вы вводите некорректные значения");
        }

        return res;
    }
//    public static boolean CheckNumbers(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            if ("1234567890".contains(Character.valueOf(str.charAt(i)).toString())) {
//                continue;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
}
