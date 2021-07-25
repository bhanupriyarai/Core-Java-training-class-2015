class firstThread extends Thread
{
public void run()
{
System.out.println("run");
}
public static void main(String...s)
{
   firstThread ft =new firstThread();
ft.start();
ft.run();
}
}