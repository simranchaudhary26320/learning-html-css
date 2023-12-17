import java.io.*;
class Demo
{
void Info()throws IOException
{
throw new IOException("program error");
}
void a()throws IOException
{
Info();
}
void Handle()
{
try
{
a();
}
catch(Exception e)
{
System.out.println("exception handle");
}}
public static void main(String[] args)
{
Demo d=new Demo();
d.Handle();
}}