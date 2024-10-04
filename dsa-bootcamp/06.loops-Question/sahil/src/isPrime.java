import java.util.Scanner;
public class isPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int number=sc.nextInt();
        int i;
        for (i=2; i<number;i++){//4 i<=4
            if (number%i==0) {//number%i==0 4%2==0 3%3==0
                System.out.println("the number is not prime ");
                break;
            }
            
        }
        if(number==i){
                System.out.println("number is prime");
        }
        
    }
}
