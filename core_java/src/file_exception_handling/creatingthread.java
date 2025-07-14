package file_exception_handling;

//multiple thread using extends 
class A extends Thread{
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println(i);
			
		}
	}
}

class B extends Thread{
	public void run() {
		for(int j =1; j<=5; j++) {
			System.out.println(j);
			
		}
	}
}
class C  extends Thread{
	public void run() {
		for(int k =1; k<=5; k++) {
			System.out.println(k);
			
		}
	}
}

public class creatingthread{
	public static void main(String[] args) {
		C obj = new C();
		A obj1 = new A();
		B obj2 = new B();
		obj.start();
		obj1.start();
		obj2.start();
		obj.start();
		
		
	}
	
}