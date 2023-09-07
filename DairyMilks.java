class DairyMilks

{
public static void main(String[]args)
{
DairyMilk d1 = new DairyMilk();
System.out.println("********before**********");
System.out.println("id ="+d1.id);
System.out.println("category ="+d1.category);
System.out.println("price ="+d1.price);
d1.id = 2492;
d1.category = "junkfood";
d1.price = 30;
System.out.println("**********after**********");
System.out.println(" id ="+d1.id);
System.out.println(" category ="+d1.category);
System.out.println(" price ="+d1.price);
d1.manufacture();
d1.sold();
d1.shipped();
}
}