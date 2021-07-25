//write to an existing file
import java.io.*;
class file 
{
   public static void main(String...s)  
   {
      try 
     {
         BufferedWriter o = new BufferedWriter(new FileWriter("myfile.txt"));
         o.write("this is the content to write");
         o.close();
         System.out.println("File created successfully");
      }
      catch (IOException e) 
      {
      }
   }
}