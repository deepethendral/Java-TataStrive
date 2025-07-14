package file_exception_handling;

class abc extends Thread{
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println("start from A :" +i);
			
		}
		System.out.println("exit from abc");
	}
}

class efg extends Thread{
	public void run() {
		for(int j =1; j<=5; j++) {
			System.out.println("start from B:"+j);
			
		}
		System.out.println("exit from efg");
	}
}
class hij  extends Thread{
	public void run() {
		for(int k =1; k<=5; k++) {
			System.out.println("start from b :" +k);
			
		}
		System.out.println("exit from hij");
	}
}

public class multithread{
	public static void main(String[] args) {
		hij obj = new hij();
		abc obj1 = new abc();
		efg obj2 = new efg();
		obj.start();
		obj1.start();
		obj2.start();
		
		
	}
	
}