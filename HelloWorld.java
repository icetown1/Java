public class HelloWorld{
	
	String hello = "Hello";
	String world = " World!";
	
	public static void main(String[] args){
		
		HelloWorld ourObject = new HelloWorld();
		
		ourObject.saySimpleHello();
		ourObject.sayOneHello("Hello, World!");
		ourObject.sayHello(ourObject.hello,ourObject);
		
		System.out.println(ourObject.returnHello());
		
	}
	
	public void saySimpleHello(){
		
		System.out.println("Hello, World!");
		
	}
	
	public void sayOneHello(String message){
		
		System.out.println(message);
		
	}
	
	public void sayHello(String h, String w){
		
		System.out.println(h + w);
		
	}
	
	public String returnHello(){
		
		return "Hello, World!";
		
	}
	
	
}