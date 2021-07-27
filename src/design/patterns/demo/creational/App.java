package design.patterns.demo.creational;

// design.patterns.demo.creational design patterns 
// singleton class 

public class App {

	public static void main(String[] args) {

		SingletonClass obj = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println(obj.equals(obj2));
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

	}

}
