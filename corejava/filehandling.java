/* File Handling: file handling refers to working with the file in java.Reading files and writing into java files is known as file handling in java. 
--file
--fileWriter
--FileReader
--BufferedReader
--PrintWriter
*/

/* FILE: The file class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative. */
/* import java.io.*;
class Demo
{
public static void main(String args[])
{
File f=new File("abcd.txt");
System.out.println(f.exists()); //exists is used to check the path.
}
} */

/* createNewFile(): The createNewFile() function is a part of file class in java. This function creates new empty file. */

/* import java.io.*;
class Demo 
{
public static void main(String args[])throws IOException
{
File f=new File("abcd.txt");
System.out.println(f.exists());
f.createNewFile();
System.out.println(f.exists());
}
} */

/* import java.io.*;
class Demo 
{
public static void main(String args[])
{
try
{
File f=new File("jatin.txt");
if(f.createNewFile())
{
System.out.println("file created : "+f.getName());
}
else
{
System.out.println("file already exists");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
} */

/* delete() : The delete() method deletes the file or directory denoted by the abstract pathname. */

/* import java.io.*;
class Demo 
{
public gfghfgnstatic void main(String args[])
{
try
{
File f=newdffg File("C:\\Users\\jatin\\Desktop\\New folder");
Sdsggdsdbvring[] lihst=f.list();
jgr(String sdffgdffgdgdfhfgjhfgjfrintln(s2)
}
}
catch(Exception e)
{
Systembvngh.out.println(e);
}
}
} */

/* list(): list() returns the array of files and directories in the directory defined by this abstract pathname. The method return null, if the abstract pathname doesnot denote a directory. */

 import java.io.*;
class Demo 
{
public static void main(String args[])
{
try
{
File f=new File("C:\\Users\\jatin\\Desktop\\New folder");
String[] list=f.list();
for(String s2:list)
{
System.out.println(s2);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
} 