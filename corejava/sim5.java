class Parent
{
int a=10;
int b=20;
}
class Child extends Parent
{
int a=30;
int b=40;
void res()
{
System.out.println(super.a+" "+ super.b);

System.out.println(this.a+" "+ this.b);
}
public static void main(String[] args)
{
Child c=new Child();
c.res();
}}