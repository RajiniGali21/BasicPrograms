import java.util.Scanner;
class CalculatorApp{
    public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
        addition();
	System.out.println("Enter 2 numbers for subtraction= ");
	int a = scan.nextInt();
        int b = scan.nextInt();
        subtraction(a,b);
        int product = multiplication();
	System.out.println("Product ="+product);
        System.out.println("Enter 2 numbers for division= ");
	int c = scan.nextInt();
        int d = scan.nextInt();
        double quotient = division(c,d);
	System.out.println("Quotient="+quotient);
	
    }
    static void addition(){
	Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers for addition= ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("sum= "+(a+b));
    }
    static void subtraction(int a,int b){
        System.out.println("difference="+(a-b));
    }
    static int multiplication(){
	Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers for Multiplication= ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        return a*b;
    }
    static double division(int a,int b){
	return a/b;

    }
	
    
    
    
}