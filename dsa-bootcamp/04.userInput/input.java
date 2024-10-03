import java.util.Scanner;//note
public class input {

    public static void main(String[] args) {
        //print opeartor datatype conditions
        //variabale=input("Enter a value")
        Scanner sc=new Scanner(System.in);//
        //int:
        int num1=sc.nextInt();
        System.out.println(num1);
        //float 
        float factNum=sc.nextFloat();
        System.out.println(factNum);
        //long
        long longNumber=sc.nextLong();
        System.out.println(longNumber);
        //String

        // String name=sc.next();
        // System.out.println(name);

        String name2=sc.nextLine();
        System.out.println(name2);

        //char
        char letter=sc.nextLine().charAt(0);
        System.out.println(letter);

        //boolean

        boolean flag=sc.nextBoolean();
        System.out.println(flag);

    }
}