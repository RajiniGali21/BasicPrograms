class Disneybakery
{
static void makechai()
{
System.out.println("Bill for the normal tea = 10");
}
static void makechai(int quantity)
{
System.out.println("Bill for the normal tea =" +(quantity*10));
}
static void makechai(String flavour)
{
System.out.println("Bill for" +flavour+ "tea is = 20");
}
static void makechai(String flavour, int quantity)
{
System.out.println("Bill for" +flavour+ "tea is =" +(quantity*20));
}
static void makechai(String flavour,String instruction, int quantity)
{
System.out.println(" Bill for " +flavour+ " tea with " +instruction+ " is = " +(quantity*20));
}
public static void main(String[]args)
{
makechai();
makechai(3);
makechai("lemon");
makechai("ginger",3);
makechai("elaichi","sugar less",2);
}
}