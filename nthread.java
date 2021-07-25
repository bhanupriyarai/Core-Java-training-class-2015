class firstThread implements Runnable
{
public void run()
{
System.out.println("run");
}
public static void main(String...s)
{
   firstThread ft =new firstThread();
   Thread t =new Thread(ft);
t.start();

}
}