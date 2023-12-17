class Demo
{
double result=0;
void add(double num1, double num2)
{
result= num1 + num2;
System.out.println("result:"+result);
this.sub(10.5,30.5);
}
void sub(double num1, double num2)
{
result= num1 - num2;
System.out.println("result:"+result);
}
public static void main(String[]args)
{
Demo d=new Demo();
d.add(10.5,30.5);
d.sub(10.5,30.5);
}}
