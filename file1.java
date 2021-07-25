//create blank file
import java.io.*;
class file
{
  public static void main(String...s) throws IOException
{
  File f = new File("myarchive.txt");
  f.createNewFile();
  System.out.println("New file \"myarchive.txt\" has been created");
  }
} 