import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //System.out.print("Enter operand1:");
        //int operand1=sc.nextInt();
        //sc.nextLine();
        
        //System.out.print("Enter operand2:");
        //int operand2=sc.nextInt();
        int result=0;
        while(true){
            System.out.print("Enter operator:");
            char operator=sc.next().trim().charAt(0);
        if(operator=='+'||operator=='-'||operator=='*'||operator=='/'||operator=='%'){
            System.out.print("Enter operand1:");
            int operand1=sc.nextInt();
            System.out.print("Enter operand2:");
            int operand2=sc.nextInt();
            if(operator=='+'){
                result=operand1+operand2;
                System.out.println(result);
            }
            else if(operator=='-'){
                result=operand1-operand2;
                System.out.println(result);
            }
        else if(operator=='*'){
            result=operand1*operand2;
            System.out.println(result);
            }
        else if(operator=='/'){
            if(operand2!=0){
            result=operand1/operand2;
            System.out.println(result);
            }
            else{
                System.out.println("infinity,Error : ZeroDivisionError");
            }
        }
        else{
            result=operand1%operand2;
            System.out.println(result);
        }

        }
    else if(operator=='x'||operator=='X'){
        break;
    }
    else{
        System.out.println("Error:Please, Enter a valid input!");
    }
    System.out.println("If you want to exit from the calculator , press 'x' or'X' in the operator!!!" );

}

    }
    
}

