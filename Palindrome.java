import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int n,rem,rev=0;
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
int num=n;
if(n>9)
{
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(rev==num)
{
System.out.println("The number is palindrome");
}
else
{
System.out.println("The number is not palindrome");
}
}
else
{
System.out.println("Invalid Data");
}
}
}
