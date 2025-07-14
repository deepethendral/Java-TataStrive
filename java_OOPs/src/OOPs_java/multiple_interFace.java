package OOPs_java;

interface aa {
    void methodA();
}

interface bb {
    void methodB();
}

class cc implements aa, bb {//class can implements multiple interface
    public void methodA() {
        System.out.println("methodA is going to shoow");
    }

    public void methodB() {
        System.out.println("methodB is going to sleep");
    }
}

interface dd {
	public void methodz();
}

class Fff implements dd{
	public void methodz()//here ; no come don't forgot
	{
		System.out.println("hi hello");
	}
}
 public class multiple_interFace{
	 public static void main(String[] args) {
		 cc obj = new cc();
		 obj.methodA();
		 Fff obj1 = new Fff();
		 obj1.methodz();
	 }
 }
  