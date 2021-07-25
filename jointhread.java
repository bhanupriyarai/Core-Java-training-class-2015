class firstThread implements Runnable
{
public void run()
{
for(int i =0;i<5;i++)
{
  try{
Thread.sleep(500);

System.out.println("run"+i+""+Thread.currentThread().getName());
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
Thread t2 =new Thread(ft);
Thread t1 =new Thread(ft);
t.start();
t.setName("pappu");

try{
t.join();
}
catch(Exception e)
{
System.out.println("exception"+e);
}
t1.start();
t2.start();

}
}