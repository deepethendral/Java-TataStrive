package file_exception_handling;
class moo extends Thread{
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println("start from i :" +i);
			
		}
		System.out.println("exit from moo");
	}
}

class boo extends Thread{
	public void run() {
		for(int j =1; j<=5; j++) {
			System.out.println("start from j:"+j);
			
		}
		System.out.println("exit from boo");
	}
}
class too  extends Thread{
	public void run() {
		for(int k =1; k<=5; k++) {
			System.out.println("start from k :" +k);
			
		}
		System.out.println("exit from too");
	}
}

public class threadpriority{
	public static void main(String[] args) {
		too obj = new too();
		moo obj1 = new moo();
		boo obj2 = new boo();
		obj.setPriority(Thread.MAX_PRIORITY);
		obj1.setPriority(obj.getPriority()-1);
		obj2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("theard moo started: ");
		
		obj.start();
		System.out.println("theard boo started: ");
		obj1.start();
		System.out.println("theard too started: ");
		obj2.start();
		System.out.println("end of thread ");
		
		
	}
	
}