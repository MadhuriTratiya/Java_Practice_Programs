import java.util.Scanner;

public class gretest_no {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Equal");
        }
        else{
            if(num1 > num2){
                System.out.println("Num1 greter");
            }
            else{
                System.out.println("Num2 is greter");
            }
        }
    }
}
