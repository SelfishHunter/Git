package addnos;

import java.util.Scanner; 
public class clientprogram
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 nos");
int a = sc.nextInt();
int b = sc.nextInt();
AddNos a1=new AddNos(a,b);
a1.add();
a1.display();
}
}
class AddNos 
{
int x,y,ans;
public AddNos(int a,int b)
{
x = a;
y = b;
}
public void add()
 {
ans = x+y;
 }
public void display()
{
System.out.println("the ans is "+ans);
}
}
