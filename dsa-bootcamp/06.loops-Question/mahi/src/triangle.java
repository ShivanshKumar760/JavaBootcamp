import java.util.Scanner;
public class triangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number seprated by space:");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        if(side1<=0||side2<=0||side3<=0){
            System.out.println("invalid input");
        }
        else{
            if (side1==side2 && side2==side3) {
                System.out.println("this is Equilateral triangle");
            }
            else if(side1==side2 || side2==side3 || side3==side1){
                System.out.println("this is Isosceles triangle");
            }
            else {
                System.out.println("this is scalene triangle");
            }
        }
           
            
        
    }
}