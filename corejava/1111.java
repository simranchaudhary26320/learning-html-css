interface demo1
{
void add();
}
interface demo2 extends demo1
{
void sub();
}
interface demo3 extends demo2
{

}

class Test implements demo3
{
int n1=1;
int n2=5;
public void add()
{
System.out.println(n1+n2);
}
public void sub()
{
System.out.println(n1-n2);
}


public static void main(String args[])
{
Test t1=new Test();
t1.add();
t1.sub();
}
}