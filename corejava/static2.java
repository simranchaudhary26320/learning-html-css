class Test
{
static
{
System.out.println("static block is invoked");
System.exit(0);
}}



Error: Main method not found in class Test, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application




// It will execute without main method since below the JDK1.7 version
