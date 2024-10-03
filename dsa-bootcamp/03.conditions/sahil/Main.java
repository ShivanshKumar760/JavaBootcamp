import java.util.Scanner;

import tool.Calc;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        char opr=sc.next().charAt(0);
        int result=Calc.calculate(num1,num2,opr);
        System.out.println(result);
        sc.close();
    }
}