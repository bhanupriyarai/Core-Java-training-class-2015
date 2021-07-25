//copy one file to other
import java.io.*;
class file
{
    public static void main(String...s) 
    {
          FileInputStream f1 = null;
          FileOutputStream f2 = null;

          try{
               f1 = new  FileInputStream("file1.txt");
               f2 = new FileOutputStream("myfile.txt");

               int ch;
               while((ch=f1.read())!=-1)
		{
                    f2.write(ch);
               }
             }catch(IOException e)
                {
                  System.out.println(e);
                  System.exit(0);
                }
            finally{
                 try{
                       f1.close();
                       f2.close();
                 }
                 catch(IOException e){}
            }

    }
}