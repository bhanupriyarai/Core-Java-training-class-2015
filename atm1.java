import java.util.Scanner;
class atm
{
static int n;
static int amt = 50000;

public static void main(String...s)
{
        atm a = new atm();
        a.menu();
}

public void menu()
{
System.out.println("enter username and  password");
String m;
Scanner sc = new Scanner(System.in);
m=sc.next();
n=sc.nextInt();
System.out.println("1.withdrawl 2. deposit 3.balance 4.mini stmt 5.exit");
int i;
i=sc.nextInt();
switch(i)
{
case 1:  A a = new A();
         a.withdrawl();
         System.out.println("enter choice 1.continue 2.exit");
	int x = sc.nextInt();
	switch(x)
	{
	case 1 : this.menu();
	case 2 : System.out.println("you have been logged out"); 
	System.exit(0);
	break;
	}
         
    

case 2: B b =new B();
        b.deposit();
        System.out.println("enter choice 1.continue 2.exit");
	int y = sc.nextInt();
	switch(y)
	{
	case 1 : this.menu();
	case 2 : System.out.println("you have been logged out"); 
	System.exit(0);
	break;
	}
       

case 3:System.out.println("balance"+amt);
       System.out.println("enter choice 1.continue 2.exit");
	int z = sc.nextInt();
	switch(z)
	{
	case 1 : this.menu();
	case 2 : System.out.println("you have been logged out"); 
	System.exit(0);
	break;
	} 
         
case 4:System.out.println("balance"+amt);
       System.out.println("enter choice 1.continue 2.exit");
	int w = sc.nextInt();
	switch(w)
	{
	case 1 : this.menu();
	case 2 : System.out.println("you have been logged out"); 
	System.exit(0);
	break;
        }

case 5: System.exit(0);

default: System.out.println("invalid input");
}
}
}

class A extends atm
{
Scanner sc = new Scanner(System.in);
public void withdrawl()
{
int o;
System.out.println("enter pin");
	  o=sc.nextInt();
             
            if(o==n)
	       { System.out.println("1.savings 2.current");
                 int j=sc.nextInt();
                   switch(j)
                   { case 1: System.out.println("enter amount to be withdrawl");
                             int k=sc.nextInt();
                              if(k<amt)
                              {System.out.println("");
                               amt=amt-k;
                               System.out.println("balance"+amt);
                               }
                     else {System.out.println("error max limit of withdrawl is 20000");
                           withdrawl(); }
                          break;
                      
                     case 2: System.out.println("");
                             

default : System.out.println("invalid");
}
}
}
}


class B extends A
{
public void deposit()
{
Scanner sc = new Scanner(System.in);
System.out.println("enter pin");
	 int c=sc.nextInt();
             
              if(c==n) 
              {System.out.println("enter amount to be deposit");
                             int l=sc.nextInt();
                            amt = amt +l;System.out.println(" "+amt);
                           
                            
                        }}

}