package OOPs_java;


class Education {
	protected String principle = "alavanthar";
	public void school () {
		System.out.println("welcome to our school");
	}

}

class student extends Education{
	public String StudentClass = "cls a";
	
}

class teacher extends Education{
	public String teacher_sh = " maths";
}

public class hierarchical{
	public static void main(String[] args) {
		
		teacher mytec = new teacher();
		mytec.school();
		     
	
		
		System.out.println(mytec.principle + " " + mytec.teacher_sh); 
	}
}
//this hierarchical inheritance , we cannot use hybrid inherit in inheritance by using extends keyword
//this arises the diamond problem  
