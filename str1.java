class A
{
int id=50;
A()
{
System.out.println("id is"+id);
}
}
class B extends A
{
int id=100;
B()
{
super();
System.out.println("id is"+id);
}
public static void main(String...s)
{
B b = new B();
}
}