import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("you can enter element:+n");
for(int i=0; i<n; i++) 
{
arr[i]=sc.nextInt();
}
System.out.println("after entered array element are:");
for(int i=0; i<n; i++) 
{
System.out.println(arr[i]);
sum=sum+arr[i];
}
System.out.println("total sum"+sum);
}}
