import java.io.*;
class ATM 
{

 public static void main(String...s) throws IOException
{
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  File file = new File("username.txt");
 System.out.print("Please enter the user name : "); 
  FileWriter fstream = new FileWriter("username.txt");
  BufferedWriter o = new BufferedWriter(fstream);
  o.write(in.readLine());
  o.close();
  
  File file1 = new File("password.txt");
 System.out.print("Please enter the password : "); 
  FileWriter gstream = new FileWriter("password.txt");
  BufferedWriter k = new BufferedWriter(gstream);
   k.write(in.readLine());
   k.close();
}
}

   