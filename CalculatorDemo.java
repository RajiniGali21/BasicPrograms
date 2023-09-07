import java.util.Scanner;
class CalculatorDemo
{
public static void main(String[]args)
{
addition();
Scanner scan = new Scanner(System.in);
System.out.println("Enter two values for subtraction:");
int a = scan.nextInt();
int b = scan.nextInt();
subtraction(a,b);
int product =  multiplication();
System.out.println(" multiplication: " +product);
System.out.println("ENter two values for division:");
int c = scan.nextInt();
int d = scan.nextInt();
double quotient = division(c,d);
System.out.println("division =" +quotient);
System.out.println("enter two values for modulodivision:");
int e = scan.nextInt();
int f = scan.nextInt();
int remainder = modulodivision(e,f);
System.out.println(" modulodivision: "+remainder);
System.out.println("enter two values for average:");
int g = scan.nextInt();
int h = scan.nextInt();
int result = average(g,h);
System.out.println(" average: "+result);
}
static void addition()
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter two values for addition:");
int a = scan.nextInt();
int b = scan.nextInt();
System.out.println("addition="+(a+b));
}
static void subtraction(int a ,int b)
{
System.out.println("Subtraction=" +(a-b));
}
static int multiplication()
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter two values for multiplication:");
int a = scan.nextInt();
int b = scan.nextInt();
return a * b;
}
static double division(double c,double d)
{
return c/d;
}
static int modulodivision(int e, int f)
{
return e%f;
}
static int average(int g, int h)
{
return g+h/2;
}

} 