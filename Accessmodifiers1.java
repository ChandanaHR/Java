package package1;

public class Project1 {
	
	public class A {
		public void publicmethod() {
			System.out.println("This is a public method");
		}
		
		private void privatemethod() {
			System.out.println("This is a private method");
		}
		
		protected void protectedmethod() {
			System.out.println("This is a protected method");
		}
		
		void defaultmethod() {
			System.out.println("This is a default method");
		}
	}
	
	public class B extends A {
		public void publicmethod() {
			System.out.println("This is a public method");
		}
		
		private void privatemethod() {
			System.out.println("This is a private method");
		}
		
		protected void protectedmethod() {
			System.out.println("This is a protected method");
		}
		
		void defaultmethod() {
			System.out.println("This is a default method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project1 outer = new Project1();
		A object1 = outer. new A();
		object1.publicmethod();
		object1.privatemethod();
		object1.protectedmethod();
		object1.defaultmethod();
		
		B object2 = outer.new B();
		object2.publicmethod();
		object2.privatemethod();
		object2.protectedmethod();
		object2.defaultmethod();
	}

}
//Here all the outputs are displayed because inside project1 we are having inner classes A and B which is valid


package package1;

public class Project1 {
	public void publicmethod() {
		System.out.println("This is a public method");
	}
	
	private void privatemethod() {
		System.out.println("This is a private method");
	}
	
	protected void protectedmethod() {
		System.out.println("This is a protected method");
	}
	
	void defaultmethod() {
		System.out.println("This is a default method");
	}
	
	public class B extends Project1 {
		public void publicmethod() {
			System.out.println("This is a public method");
		}
		
		private void privatemethod() {
			System.out.println("This is a private method");
		}
		
		protected void protectedmethod() {
			System.out.println("This is a protected method");
		}
		
		void defaultmethod() {
			System.out.println("This is a default method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project1 outer = new Project1();
		outer.publicmethod();
		outer.privatemethod();
		outer.protectedmethod();
		outer.defaultmethod();
		
		B object2 = outer.new B();
		object2.publicmethod();
		object2.privatemethod();
		object2.protectedmethod();
		object2.defaultmethod();
	}

}

