                       import java.util.Scanner;
class arr
{
public static void main(String...s)
{
int []arr=new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++)
{arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
System.out.print("array value"+arr[i]);
}
}