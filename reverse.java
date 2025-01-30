import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=input.nextInt();
        int reverse=0;
        while(num>0){
            int number=num%10;
            reverse=reverse*10;
            reverse+=number;
                num/=10;
            }
            System.out.println(reverse);    
    }
}
/*
 * Algorithm:
 * 
 * using while loop condition num>0,num=num/10
 * 1.num%10=rem,store in n=new value
 * then n=n*10
 * 
 */