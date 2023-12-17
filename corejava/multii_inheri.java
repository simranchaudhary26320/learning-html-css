class Parents
{
void p()
{
System.out.println("parent class properties");
}
}
class Child extends Parents
{
void c()
{
System.out.println("child class properties");
}
}
class Subchild extends Child
{
void subchild()
{
System.out.println("subchild class properties");
}
public static void main(String[] args)
{
Subchild cc=new Subchild();
cc.p();
cc.c();
cc.subchild();
}}

 