class Calculator
{
double num1=11,num2=22,result=0;
void add()
{
result=num1+num2;
System.out.println(result);
}
void sub()
{
result=num1-num2;
System.out.println(result);
}
void multiply()
{
result=num1*num2;
System.out.println(result);
}
void divide()
{
result=num1/num2;
System.out.println(result);
}
public static void main(String[] args)
{
Calculator c=new Calculator();
c.add();
c.sub();
c.multiply();
c.divide();
}}