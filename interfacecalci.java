                    import java.util.Scanner;
interface I1
{
 void add();
 void sub();
 }

interface I2
{
 void multi();
 void div();
}

class A implements I1,I2
{
public void add()
{
double a,b,result;
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
result = a + b;
System.out.println("the result is" +result);
} 

public void sub()
{
double a,b,result;
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
result = a - b;
System.out.println("the result is" +result);
} 



public void multi()
{
double a,b,result;
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
result = a * b;
System.out.println("the result is" +result);
} 

public void div()
{
double a,b,result;
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
result = a / b;
System.out.println("the result is" +result);
} 

public static void main(String...s)
{
I1 x=new A();
I2 b=new A();
System.out.println("enter number");
Scanner sc = new Scanner(System.in);
int op=sc.nextInt();
{
switch(op)
{
 case 1:
        x.add();
        break;
 case 2:
        x.sub();break;
 case 3:
         b.multi();break;
 case 4:
          b.div();break;
}
}
}
}
