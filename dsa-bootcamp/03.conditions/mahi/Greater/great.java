package Greater;

public class great{
    public static void findGreater(int n1,int n2,int n3)
    {
        //write code here
        if(n1>n2){
            if(n1>n3){
                System.out.println("n1 is the greatest number");
            }
            else{
                System.out.println("n3 is the greatest");
            }
        }
        else
        {
            if(n2>n3){
                System.out.println("n2 is the greatest");
            }
            else{
                System.out.println("n3 is the greatest");
            }

        }
    }

}