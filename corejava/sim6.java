class Parent
{
double salary=100000;
}
class Child extends Parent
{
double bonous=80000;
public static void main(String[] args)
{
Child c=new Child();
System.out.println(c.salary);
System.out.println(c.bonous);
}}