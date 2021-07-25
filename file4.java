//make file by username and write content by user
import java.io.*;
class file
{

  public static void main(String...s) throws Exception
{
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Please enter the file name to create : ");
  String file_name = in.readLine();
  File file = new File(file_name);
  boolean exist = file.createNewFile();
  if (!exist)
  {
  System.out.println("File already exists.");
  System.exit(0);
  }
  else
  {
  FileWriter fstream = new FileWriter(file_name);
  BufferedWriter out = new BufferedWriter(fstream);
  out.write(in.readLine());
  out.close();
  System.out.println("File created successfully.");
  }
  }
} 