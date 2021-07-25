class A 
{
A()
{
System.out.println("constructor");
}
int id;
String name;
A(int id, String name)
{
this();
this.id = id;
this.name = name;
}
void display()
{
System.out.println("displayS"+id +name);
}
void show()
{
this.display();
System.out.println("show");
}
public static void main(String...s)
{
A a = new A(10,"dsdvad");
a.show();
}
}