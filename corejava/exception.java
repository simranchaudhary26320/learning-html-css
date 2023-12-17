//exception handling 
//try-catch 
/* class Test
{
public static void main(String args[])
{
try
{
System.out.println(10/0);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Thank you!!!");
}
} */

//try with multiple catch block
/* class Test
{
public static void main(String args[])
{
try
{
//System.out.println(10/0);
System.out.println(10/2);
System.out.println("try block");
System.out.println("deepak".charAt(22));
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(StringIndexOutOfBoundsException ee)
{
System.out.println(ee);
}
}
}*/

//nested try and catch block
/* class Test
{
public static void main(String args[])
{
try
{
//System.out.println(10/0);
System.out.println(10/2);
try
{
System.out.println("deepak".charAt(22));
}
catch(StringIndexOutOfBoundsException ee)
{
System.out.println(ee);
}
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
} */

//finally keyword:
//The finally keyword is used to create a block of code that follows a try block. A finally block  of code //always execute, whether  or not an exception has occurred. Using a finally block allows you to run any //cleanup-type statements.
//-- in other word finally keyword in java . a finally block of code always executed whether exception handle //or  not. it is used to close the important connection. 
//we can use finally keyword try with finally or try-catch with finally. 

//example1
/*class Test
{
public static void main(String[] args)
{
try
{
System.out.println(10/2);
}
finally
{
System.out.println("finally block");
}
System.out.println("rest of the app");
}
} */
//example2
/* class Test
{
public static void main(String[] args)
{
try
{
System.out.println(10/0);
}
finally
{
System.out.println("finally block");
}
System.out.println("rest of the app");
}
} */

//example 3
/* class Test
{
public static void main(String[] args)
{
try
{
//System.out.println(10/0);
System.out.println(10/2);
}
finally
{
System.out.println(10/0);
//System.out.println("finally block");
}
System.out.println("rest of the app");
}
} */

//try catch with finally
/*class Test
{
public static void main(String[] args)
{
try
{
System.out.println(10/0);
}
catch (Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("finally block");
}
System.out.println("rest of the app");
}
} */

//MATHODS
// 1 toString()
// 2 getMessage()
// 3 printStackTrace()

/* 1 toString(): The toString() method if the Throwable class overrides the toString() method of the Object class. It prints the short description of an exception. It doesnot show the other information (like exception name and stacktrace). It is not widely used to print the exception message. */

/* class Test
{
public static void main(String[] args)
{
try
{
System.out.println(10/0);
}
catch(Exception e)
{
System.out.println(e.toString());
}
System.out.println("rest of the app");
}
} */

/* 2 getmessage(): The java.lang.Throwable.getMessage() method returns the detail message string of this throwable.*/

/* class Test
{
public static void main(String[] args)
{
try
{
System.out.println(10/0);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println("rest of the app");
}
} */

/* 3 printStackTrace(): The printStackTrace() method in java is a tool used to handle exception and errors. It is a method of java's throwable class which prints the throwabl(net se dekh chl) */

//its use only exception handling
/* class Test
{
public static void main(String[] args)
{
try
{
System.out.println(10/0);
}
catch(Exception e)
{
e.printStackTrace();
}
System.out.println("rest of the app");
}
}*/

/* Throw keyword: it is keyword in java which is used to throw an exception to the jvm. */
//example 1
/*class Test
{
public static void main(String args[])
{
throw new ArithmeticException("enter vaild number");
}
}*/
//example2
/* class Test
{
public static void main(String args[])
{
try
{
System.out.println(10/0);
}
catch(Exception e)
{
throw new ArithmeticException("enter vaild number");
}}
} */

//throws keyword: throws keyword in java is used to declear an exception. I...

/* syntax:
return_type method_name()throws Exception_class_name
{
method body
} */

//example1
/* import java.io.*;
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
System.out.println("Exception handle");
}
}
public static void main(String args[])
{
Demo d=new Demo();
d.Handle();
}
} */

//Example 2(compile time error)
/* import java.io.*;
class Demo
{
public static void main(String args[])
{
File f=new File("abcd.txt");
Filewriter fw=new FileWriter(f);
}
} */

/* Q:- user defined exception handling code.*/
/*
import java.io.*;
class Demo
{
public static void main(String argas[])
{
throw new ArithmeticException("dhayan se kar program");
}
{
System.out.println(10/0);
}} */