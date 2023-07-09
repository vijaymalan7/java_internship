import java.util.Scanner;
public class calculater{
     public static void main(String[] args)
    {
    int num1,num2,ans;
    char ch;
    Scanner sc= new Scanner(System.in);

    System.out.println("enter First numbers :");
    num1 =sc.nextInt();

    System.out.println("enter Second numbers:");
    num2 =sc.nextInt();

    System.out.println("enter the oprator '+' '-' '*' '/' and for remender '%' ");
    ch= sc.next().charAt(0);

    switch(ch) {
        case '+' :
         ans=num1+num2;
        System.out.println("addition :" +ans);
        break;

        case '-' : 
        ans=num1-num2;
        System.out.println("substraction :" +ans);
        break;

        case '*': 
        ans=num1*num2;
        System.out.println("multiplication :" +ans);
        break;

        case '/': 

        ans=num1/num2;
        System.out.println("division :"+ans);
        break;

        case '%':
        ans=num1%num2;
        System.out.println("reminder :"+ans);
        break;
        
        default:
          System.out.println("wrong input"+ch);

    }
   
} 
        
}