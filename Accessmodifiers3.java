//other package->same java file->same class
//package2->Project2.java->Project1 class in package1 Project1
//Project1.java in package1
package package1;

	

public class Project1 {
	
	public void publicmethod() {
		System.out.println("This is public method");
	}
	
	private void privatemethod() {
		System.out.println("This is private method");
	}
	
	protected void protectedmethod() {
		System.out.println("This is protected method");
	}
	
	void defaultmethod() {
		System.out.println("This is default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project1 obj1 = new Project1();
		obj1.publicmethod();
		obj1.privatemethod();
		obj1.protectedmethod();
		obj1.defaultmethod();
	}

}
//Project2/java
package package2;
import package1.Project1;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project1 obj2 = new Project1();
		obj2.publicmethod();
		obj2.privatemethod();
		obj2.protectedmethod();
		obj2.defaultmethod();
	}

}
Output - > Public is executed, private\protected\default will not be executed


  //other package->same java file-> sub classes
  //package2->Project2.java->P class=B subclass from package1
  //P class- B subclasses package1 file
  package package1;

public class P {
	
	public class B extends Project1 {
		public void publicmethod() {
			System.out.println("This is public method");
		}
		
		private void privatemethod() {
			System.out.println("This is private method");
		}
		
		protected void protectedmethod() {
			System.out.println("This is protected method");
		}
		
		void defaultmethod() {
			System.out.println("This is default method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P outer = new P();
		B obj1 = outer.new B();
		obj1.publicmethod();
		obj1.privatemethod();
		obj1.protectedmethod();
		obj1.defaultmethod();
	}

}
//Project2.java in package2
package package2;
//import package1.Project1;
import package1.P;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P outer = new P();
		P.B obj2 = outer.new B();
		obj2.publicmethod();
		obj2.privatemethod();
		obj2.protectedmethod();
		obj2.defaultmethod();
	}

}
Output->public() will be executed, private,protected,default will not be executed
