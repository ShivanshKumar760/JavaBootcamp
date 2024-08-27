import java.util.*;


// class car{
//     //f1

//     //f2
// }

// car obj1=new car()
public class input{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //integer -long 
        System.out.print("ENter a integer value");
        int num1=sc.nextInt();
        System.out.println(num1);
        //string
        System.out.print("ENter a string value");
        String name=sc.next();
        System.out.println(name);
        //double
        System.out.print("ENter a double value");
        double fracNum=sc.nextDouble();
        System.out.println(fracNum);
        //float 
        System.out.print("ENter a float value");
        float fracNum2=sc.nextFloat();
        System.out.println(fracNum2);
        //boolean
        System.out.print("ENter a boolean value");
        boolean logValue=sc.nextBoolean();
        System.out.println(logValue);

    }
}