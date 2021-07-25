import java.io.*;
import java.util.Scanner;
class file
{
public static void main(String...s)
{
try
{
int i = 0;
System.out.println("enter file content to write to file1");
Scanner sc = new Scanner(System.in);
String a = sc.next();
byte []b = a.getBytes();
File f = new File("file5.txt");
f.createNewFile();
FileInputStream in = new FileInputStream(f);
in.read(b);
System.out.println("file read successfully");
FileOutputStream out = new FileOutputStream(f);
out.write(b);
}
catch(Exception e)
{
System.out.println("exception caught");
}
}
}