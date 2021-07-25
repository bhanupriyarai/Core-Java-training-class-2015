class A
{
void display(int j,String k)
{
System.out.println("+j+"+k);
}
void display(String l,String i)
{
System.out.println("+l+"+i);
}
public static void main(String...s)
{
 A a=new A();
a.display(10,"government");
a.display("good","goofy");
}
}
