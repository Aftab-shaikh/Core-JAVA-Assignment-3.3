package conturtorchaining;

/*
 * this class is about constructor chaining.
 */

public class Main {
 
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Student2 student= new Student2(); // object created of child class
		
	}
}

class Student1{ // parent class
	
	Student1(){ // constructor of parent class
	System.out.println("Parent class consturctor called");	
	}
	
}

class Student2 extends Student1{
	
	Student2(){ // constructor of child class
		this(5); // this is use to call another constructor of same class (constructor chaining)
		System.out.println("Child class consturctor 1 called");
	}
	
	Student2(int num1){
		// super(); // compiler has automatically called parent class constructor here. 
		System.out.println("Child class consturctor 2 called");
	}
	
}
