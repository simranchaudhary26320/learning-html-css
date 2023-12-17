class Emp
{
int Id;
String empName;
static String compnay="Ducat";
//static method to change the value of static variable.
static void cchange()
{
compnay="HCL";
}
Emp(int r, String n)
{
Id=r;
empName=n;
}
//method to print value
void dsp()
{
System.out.println(Id+" "+empName+" "+ compnay);
}
public static void main(String[] args)
{
cchange();
Emp e1=new Emp(1,"Deepak");
Emp e2=new Emp(2,"Simran");
Emp e3=new Emp(3,"Rooh");
e1.dsp();
e2.dsp();
e3.dsp();
}}
