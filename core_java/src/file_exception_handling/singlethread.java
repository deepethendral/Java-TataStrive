package file_exception_handling;

//single thread using extends
class Res {
	synchronized void pn(int n) {
		for(int i =1; i<=5; i++) {
			System.out.println(i*n);
			try { Thread.sleep(500); }  
			catch(InterruptedException e ) 
			
			{ e.printStackTrace();
		}
	}

}
}

class mythread extends Thread {
	 Res resource;
	int num;
	
mythread (Res resource , int num){
	this.resource = resource;
	this.num = num;
	
}
public void run()
{
	resource.pn(num);
}

public class singlethread{
	public static void main(String[] args) {
		Res r = new Res();
		mythread th = new mythread(r , 2);
		mythread th2 = new mythread(r, 4);
		th.start();
		th2.start();
	}
}
}