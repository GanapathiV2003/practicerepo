import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("number : ");
        int num=sc.nextInt();
        System.out.print("Enter the number to find ,how many times occurs :");
        int number=sc.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==number){
                count+=1;
            }num/=10;
            
        }
        System.out.println(number+" can be occured in "+count+" times");
        
    }
    
}
 /*
        ALGORITHM:
         * get input from user
         * create variable count the number value=0
         * create while,condition is number >0
         * then,number%10,it gives remainder
         * then ,using if condition to check the given number==remainder mean,
         * count+=1,otherwise exit
         * condition(number=number/10)
         */
