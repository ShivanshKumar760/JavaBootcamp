public class condition{
    public static void main(String[] args) {
        /*
         [boy1 ,boy2 ,boy3 ]
         condition(if atleast one girl comes)//true//false
         {
            print("Sahil goes")
        }
        else{
            print("Mkc")    
        }

        conditions are used to change the flow of program using the truth value of conditions

        if,if-else and if-else if-else 

        Syntax:
        if(condition to be passed is true)
        {
            //execute this block of code 
        }

        2.if-else
        if(condition to be passed is true)
        {
            //execute this block of code 
        }
        else{
            //if block fails execute else block
        }

        there are more than one condition we will use if-else if-else


        +-add
        -:sub
        *-multi
        /-division
        %-remainder
        == value checker
        = assignment
        += assign and then add int num1 =4; num1+=5;//num1=num1+5
        -= assign and then subtract

        *= assign then multiply
        /= assign then divide
        %= assign then modulos

        logical 
        && logical and
        || logical or
        !  logical not gate

        int num1=10;
        int num2=11;
        num1+num2;
        operands:num1 and num2
        operator:+

         */


        int num1=10;
        if(num1>10)
        {
            System.out.println("Number passed is greater than 10");
        }
        else if(num1==10)
        {
            System.out.println("number is equal to 10");
        }
        else{
            System.out.println("Number is smaller than 10");
        }
    }
}