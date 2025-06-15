//same package - > same java file -> same class
//packag1 - > Project1.java - > Project1
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

//same package->same java file->same subclass
//Package1->Project1.java->Class name B
//ALL Output is displayed

//same package->other java file - > same class
//Package1 - > P.java -> Project1 class
Project1.java
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
P.java
  package package1;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project1 obj1 = new Project1();
		obj1.publicmethod();
		obj1.privatemethod();
		obj1.protectedmethod();
		obj1.defaultmethod();
	}

}
//private method is not accessible

//same package->other java file->sub classes
//package1->P.java->sub class(B) extending Project1
//Project1.java
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
P.java
  package package1;

public class P {
	
	class B extends Project1 {
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
//ALL THE MEthods are accessible


