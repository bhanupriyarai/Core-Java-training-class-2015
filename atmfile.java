import java.util.Scanner;
class ATM 
{
Scanner sc = new Scanner(System.in);
static double balance = 50000.00;
static String user_name = new String("shubhamran1");
static int pin = 6789;
 public static void main(String...s)
{
        ATM a = new ATM();
        a.menu();
}

public void menu() 
{
System.out.println("enter username");
String q = sc.next();
if(user_name.equals(q))
{
System.out.println("input choice 1.withdrawal 2.deposit 3.exit 4.mini statement 5.balance");
int c = sc.nextInt();
switch(c)
{
case 1 : this.withdrawal();
	System.out.println("enter choice 1.continue 2.exit");
	int x = sc.nextInt();
	switch(x)
	{
	case 1 : this.menu();
	case 2 : System.out.println("you have been logged out"); 
	System.exit(0);
	break;
	}
case 2 : this.deposit();
	System.out.println("enter choice 1.continue 2.exit");
	int y = sc.nextInt();
	switch(y)
	{
	case 1 : this.menu();
	case 2 : System.out.println("you have been logged out"); 
	System.exit(0);
	break;
	}
case 3 : System.out.println("you have been logged out"); 
	System.exit(0);
	break;
case 4 : this.statement();
	System.out.println("enter choice 1.continue 2.exit");
	int z = sc.nextInt();
	switch(z)
	{
	case 1 : this.menu();
	case 2 : System.out.println("you have been logged out"); 
	System.exit(0);
	break;
	}
case 5 : System.out.println("your current balance is"+balance);
	System.out.println("enter choice 1.continue 2.exit");
	int w = sc.nextInt();
	switch(w)
	{
	case 1 : this.menu();
	case 2 : System.out.println("you have been logged out"); 
	System.exit(0);
	break;
	}
}
}
else
{
System.out.println("invalid user");
}
}
        
public void withdrawal() 
{
System.out.println("input pin");
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
if(pin==m)
{
transac();
}
else
{
System.out.println("invalid pin");
System.exit(0);
}
}

public void transac()
{
System.out.println("your current balance is"+balance);
System.out.println("enter account type 1.savings 2.current");
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
switch(t)
{
case 1 : System.out.println("enter amount to withdraw");
	  double n = sc.nextDouble();
             if(n< balance && n>0)
		{
		   System.out.println("amount withdrawn successfully");
		    balance=balance-n;
		    System.out.println("new balance is" +balance);
		}
	     else
		{
		System.out.println("insufficient balance");
		}
case 2 : break;
}
}

public void deposit() 
{
System.out.println("input pin");
Scanner sc = new Scanner(System.in);
int o = sc.nextInt();
if(pin==o)
{
submit();
}
else
{
System.out.println("invalid pin");
 System.exit(0);
}
}
public void submit()
{
System.out.println("enter amount to submit");
Scanner sc = new Scanner(System.in);
double p = sc.nextDouble();
if(p>0)
		{
		   System.out.println("amount submitted successfully");
		    balance = balance+p;
		    System.out.println("new balance is" +balance);
		}
	     else
		{
		System.out.println("invalid amount");
		}
}

    public void statement() 
{
        System.out.println("Inquire");
        System.out.println("the current balance is");
        System.out.println("your current balance is"+balance);
}
}