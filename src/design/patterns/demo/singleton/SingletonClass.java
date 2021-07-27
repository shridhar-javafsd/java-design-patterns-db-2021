package design.patterns.demo.singleton;

public class SingletonClass {

//	private static SingletonClass obj = new SingletonClass(); // eager loading 
	private static SingletonClass obj; // lazy loading 


	private SingletonClass() {
		System.out.println("Constr");

	}

	public static SingletonClass getInstance() {
		if (obj == null)
			obj = new SingletonClass(); // lazy loading 
		return obj;
	}
}
