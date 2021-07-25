import java.util.Scanner;
class string 
{  
public static void main(String args[])
{  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the string:");
String a ="di qw hi";
int b = a.length();
System.out.println("length of the string is:" +b);
for(int i=0;i<b;i++)
{
char c = a.charAt(i);
switch (c) 
{  
case 'a':  
case 'e':  
case 'i':  
case 'o':  
case 'u':  System.out.println("The character character is a Vowel.");  
		break;  
case '0':  
case '1':   
case '2':  
case '3':  
case '4':  
case '5':  
case '6':  
case '7':  
case '8':  
case '9':  System.out.println("The character entered is a Number.");  
	  break;  
case '@':  
case '$':  
case '%':  
case '&':  
case '!':  
case '#':  System.out.println("The character entered is a Special Character.");  
	   break; 
case '_':  System.out.println("This is space");
		break;
default:  System.out.println("The character entered is Constant.");  
	break;  
}  
}
}
}