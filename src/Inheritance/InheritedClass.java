package Inheritance;

class Prevent{
	
	int x;
	
	public Prevent()
	{
		System.out.println("This is base class constructor");
		
	}
	
	
	public void display()
	{
		System.out.println("This is Base class Display ");
	}
	
	
	
}

class ChildDemo extends Prevent
{
	int y;
	
	
	public ChildDemo()
	{
		
		super();
		super.x=y;
		System.out.println("This is Child class Consructor");
		System.out.println("value of Y is --> "+y);
	}
	
	 public void display()
	 {
		 System.out.println("This is dispay method from child class");
	 }
	 
	 
	 
	
}



public class InheritedClass {

	 public static void main(String[] args) {
		
		
		ChildDemo c= new ChildDemo();
		c.display();
		Prevent p= new Prevent();
		p.display();
		
		

	}

}
