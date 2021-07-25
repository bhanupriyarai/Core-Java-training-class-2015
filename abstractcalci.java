                               import java.util.Scanner;
abstract class cal
{
abstract void add();
abstract void sub();
abstract void multi();
abstract void div();
}

abstract class A extends cal
{
 void add()
{
double a,b,result;
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
result = a + b;
System.out.println("the result is" +result);
}
}

abstract class B extends A
{
void sub()
{
double a,b,result;
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
result = a - b;
System.out.println("the result is" +result);
              }
}

abstract class C extends B
{
void multi()
{
double a,b,result;
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
result = a * b;
          System.out.println("the result is" +result);
               }
}

abstract class D extends C
{
void div()
{
double a,b,result;
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
result = a / b ;
          System.out.println("the result is" +result);
               }
}


class E extends D
{
public static void main(String...s)
{cal x=new E();
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
         x.multi();break;
 case 4:
          x.div();break;
}
}
}
}