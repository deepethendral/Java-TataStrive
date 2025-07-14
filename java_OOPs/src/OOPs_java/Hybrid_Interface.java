package OOPs_java;


interface A{
	public void id();
	public int idno();
}
class B implements A {
	public void id()
	{
		System.out.println("my id emp");
	}
	public int idno() {
		System.out.println(" 324234");
		return 24234;
	}
}
	
	
class C implements A  {
		public void id() {
			System.out.println("my idno 324234");
	}
		public int idno() {
			System.out.println(423);
			return  324234;
		}
}

interface  D extends A
{  	
	public int id1(); 
	public int idno1(); 
			
		}
	
public class Hybrid_Interface{

	public static void main(String[] args) {
		C myc = new C();
		B myc1 = new B();
		myc.id();
		myc.idno();
		myc1.id();
		myc1.idno();
			
	}
		
	}
		// TODO Auto-generated method stub

	



//hybrid interface