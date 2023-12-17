interface demo1
{
void add();
default void sub()
{
int a=10,b=30;
System.out.println(a-b);
}
}


class Test implements demo1
{
int n1=1;
int n2=5;
public void add()
{
System.out.println(n1+n2);
}
public static void main(String args[])
{
Test t1=new Test();
t1.add();
t1.sub();
}
}