class CarApp
{
public static void main(String[]args)
{
Car c1=new Car();
c1.color = "red";
c1.model = "benz";
c1.price = 100000;
c1.drive();
c1.honk();
System.out.println(" color = " +c1.color+  " model = "+c1.model+  " price = "+c1.price);
}
}