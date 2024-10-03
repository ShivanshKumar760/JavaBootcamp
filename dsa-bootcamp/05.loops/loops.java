import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        /* 
            list gender=[boy1,boy2,girl1,girl2];
            if(gender[0]==girl1)
            {
                print("Sahil will go")
            }
            else if(gender[1]==girl1)
            {
                print("sahil will go")
            }
            else if(gender[2]==girl1)
            {
                print("sahil will go")
            }

            for(int i=0;i<gender.length;i++)
            {
                if(gender[i]==girl1)
                {
                    print("Sahil will go");
                    break;
                }
                else
                {
                    print("Sahil wont go");
                }
            }


            //1.for loop
            2.while 
            3.do-while loop
        */

        //print all even number till 10:
        //Scanner class -Scanner object -input loop
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=1; i<=num; i++) 
        {
            if (i%2==0) {
                System.out.println("even: "+i);
            }
            else{
                System.out.println("odd: " +i);
            }
        }

        //while
        //sum of all natural number until user gives me a 
        //negative number

        //if the number is negative we will stop the iteration
        boolean flag=true;
        int sum=0;
        // while(flag)
        // {
        //     int naturalNumber=sc.nextInt();
        //     sum+=naturalNumber;
            
        //     flag=sc.nextBoolean();

        // }

        while(true)
        {
            int naturalNumber=sc.nextInt();
            if(naturalNumber<0)
            {
                break;
            }
            sum+=naturalNumber;
        }
        System.out.println(sum);
    }
}