import java.io.*;
class Demo
{
public static void main(String[] args)throws IOException
{
File f=new File("ddd.txt");
System.out.println(f.exists());
f.createNewFile();
System.out.println(f.exists());
}}