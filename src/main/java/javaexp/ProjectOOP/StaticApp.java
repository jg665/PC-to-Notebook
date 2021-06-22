package javaexp.ProjectOOP;
class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void calssMethod() {
		System.out.println(classVar); // OK
//		System.out.println(instanceVar); //Error
	}
	public void instatnceMethod() {
		System.out.println(classVar); // OK
		System.out.println(instanceVar); //OK
	}
}

public class StaticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Foo.classVar); // OK
//		System.out.println(Foo.instanceVar); // Error
		Foo.calssMethod();
//		Foo.instanceMethod();
		
		Foo f1 = new Foo();

	}

}
