import java.util.Scanner;
class A
{
double a,b,result;
int op;
void normal()
{
System.out.println("enter two numbers");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
op=sc.nextInt();
switch(op)
{
case 1 :result = a + b;
          System.out.println("the result is" +result);
               break;
case 2 :result = a - b;
          System.out.println("the result is" +result);
               break;

case 3 :result = a * b;
          System.out.println("the result is" +result);
               break;
case 4 :result = a / b ;
          System.out.println("the result is" +result);
               break;
case 5 :result = a % b ;
          System.out.println("the result is" +result);
               break;


default : System.out.println("invalid");
}
}
}

class B
{
double a,p;
int op;
void scientific()
{
System.out.println("enter number");
Scanner sc = new Scanner(System.in);
a=sc.nextDouble();
op=sc.nextInt();
switch(op)
{
case 1 :System.out.println("the result is" +Math.sin(a));
               break;
case 2 :System.out.println("the result is" +Math.cos(a));
               break;
case 3 :System.out.println("the result is" +Math.tan(a));
               break;
case 4 :System.out.println("the result is" +Math.asin(a));
               break;
case 5 :System.out.println("the result is" +Math.acos(a));
               break;
case 6 :System.out.println("the result is" +Math.atan(a));
               break;
case 7 :System.out.println("the result is" +Math.log(a));
               break;
case 8 :System.out.println("the result is" +Math.sqrt(a));
               break;
case 9 :System.out.println("enter superscript");
	p=sc.nextDouble(); 
        System.out.println("the result is" +Math.pow(a,p));
               break;
case 10 :System.out.println("the result is" +Math.cbrt(a));
               break;
default : System.out.println("invalid");
}
}
}

class calci
{
public static void main(String...s)
{
System.out.println("1.normal 2.scientific");
int n;
Scanner sc = new Scanner(System.in);
n=sc.nextInt();
switch(n)
{
case 1:  A a = new A();
         a.normal();
         System.out.println("1.continue2. exit");
	 int o=sc.nextInt();
	     switch(o)
	          {
			case 1: calci c = new calci();
				break;
			case 2: System.exit(0);

			}
	break;
case 2: B b =new B();
         b.scientific();
         System.out.println("1.continue2. exit");
	 int m=sc.nextInt();
	     switch(m)
	          {
			case 1: calci c = new calci();
				break;
			case 2: System.exit(0);

			}
	break;
default: System.out.println("invalid input");
}
}
}