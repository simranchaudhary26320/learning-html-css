class Demo
{
double result=0;
void add(double num1, double num2)
{
result= num1 + num2;
System.out.println("result:"+result);
}
void sub(double num1, double num2)
{
result= num1 - num2;
System.out.println("result:"+result);
}
public static void main(String[] args)
{
Demo d=new Demo();
d.add(10.5,10.5);
d.sub(10.5,5.5);
}}

