class Test
{
public static void main(String[] args)
{
try
{
System.out.println(10/2);
try
{
System.out.println("deepak".charAt(22));
}
catch(StringIndexOutOfBoundsException ee)
{
System.out.println(ee);
}
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}}