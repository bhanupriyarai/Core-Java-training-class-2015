class firstThread implements Runnable
{
public void run()
{
for(int i =0;i<5;i++)
{
  try{
Thread.sleep(500);

System.out.println("run"+i);
}
catch(Exception e)
{
System.out.println("exception"+e);
}
}
}
public static void main(String...s)
{
   firstThread ft =new firstThread();
   Thread t =new Thread(ft);

Thread t1 =new Thread(ft);
t.start();
t1.start();
}
}