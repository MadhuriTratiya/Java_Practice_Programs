import java.util.Scanner;

public class FuncDemoOne {

    public static int printNum(int a, int b)
    {

        return a*b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    

        System.out.println("Product is =" +printNum(a, b));

    }
    
}
