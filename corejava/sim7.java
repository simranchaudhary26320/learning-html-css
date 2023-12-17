class Parent
{
void msg()
{
System.out.println("parent+class");
}
}
class Child extends Parent
{
void info()
{
System.out.println("child class");
}
void res()
{
this.info();
super.msg();
}
public static void main(String[] args)
{
Child c=new Child();
c.res();
}}