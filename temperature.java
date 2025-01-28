import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
        Scanner temp=new Scanner (System.in);
        System.out.print("Enter the celsius : ");
       int temp_celsius=temp.nextInt();
        float temp_farenheit=(temp_celsius*9/5)+32;
        System.out.println(temp_celsius+" celsius is "+temp_farenheit+" farenheit");
        
    }
    
}
