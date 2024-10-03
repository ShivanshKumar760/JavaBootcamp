package tool;
public class Calc 
{

    public static int calculate(int num1,int num2,char opr)
    {
        //write code here +,-,*,/
        if (opr=='+') {
            return(num1+num2);
        }
        else if(opr=='-'){
            return(num1-num2);
        }
        else if (opr=='*') {
            return(num1*num2);
        }
        else{
            return(-1);
        }
      
       
    }
    
}