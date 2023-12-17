class Test
{
public static void main(String[] args)
{
int i,j;
int alpha=64; 
for(i=1;i<=4;i++)
{
for(j=4;j>=i;j--)
{
System.out.print((char)(alpha+j));
}
System.out.println();
}
}}