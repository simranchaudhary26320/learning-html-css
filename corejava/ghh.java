import java.io.*;
class Demo
{
public static void main(String[] args)throws IOException
{
File file=new File("ducat.txt");
file.createNewFile();
FileWriter fw=new FileWriter(file);
fw.write(100);
fw.write('\n');
char ch[]={'a','b','c'};
fw.write(ch);
fw.write('\n');
String name="deepak";
fw.write(name);
fw.write('\n');
fw.flush();
fw.close();
}}