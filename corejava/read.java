import java.io.*;
class Demo
{
public static void main(String[] args)throws IOException
{
File file=new File("ducat.txt");
FileReader fw=new FileReader(file);
int i=fw.read();
while(i!=-1)
{
System.out.print((char)i);
i=fw.read();
}
fw.close();
}}