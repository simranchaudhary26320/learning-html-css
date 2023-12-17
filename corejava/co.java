class Test
{
Test()
{
System.out.println("default constructor");
}
Test(int a)
{
System.out.println("parametrized constructor");
}
public static void main(String[] args)
{
Test t1=new Test();
Test t2=new Test();
}}