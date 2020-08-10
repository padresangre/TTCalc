package Calc;

import java.util.Scanner;

public class Calc {
    public static String input ="";
    public static void main(String[] args){
        System.out.println("Ведите арефметическую операцию с арабскими или римскими цмфрами(+ - * /)");
        Scanner sacan = new Scanner(System.in);
        input = sacan.nextLine();

        System.out.println(Spliter.num1);
        System.out.println(Spliter.op);
        System.out.println(Spliter.num2);
        System.out.println(Spliter.arabian());

    }
}
