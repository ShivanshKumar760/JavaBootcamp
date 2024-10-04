import java.util.Scanner;
public class vowelConsonant {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0);

        //vowel consonant
        boolean isLower =(ch=='a'||ch=='e'||ch=='i'||ch=='o'
        ||ch=='u');
        boolean isUpper =(ch=='A'||ch=='E'||ch=='I'||ch=='O'
        ||ch=='U');

        if(isLower||isUpper)
        {
            System.out.println(ch+ " is vowel.");
        }
        else{
            System.out.println(ch+" is consonent.");
        }



}

}