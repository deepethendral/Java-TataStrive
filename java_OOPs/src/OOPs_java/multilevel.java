package OOPs_java;


class Flowers{
	public void smell() 
	{
		System.out.println("this fragrance is made up of mixed flowers");
	}
	public void colour()
	{
		System.out.println("welcome to our perfume heaven");
	}
}

class rose extends Flowers{
	public String rosecolor = " baby pink";
}

class buttonrose extends rose{
	public String buttonrosecolor = " white";
}
class pannerrose extends buttonrose{
	public String pannerrosecolor = " dark pink";
}

public class multilevel {
	public static void main(String[] args) {
		pannerrose mypan = new pannerrose();
		
		mypan.colour();
		mypan.smell();
		
		
		System.out.println(mypan.pannerrosecolor + " " + mypan.buttonrosecolor +" " + mypan.rosecolor);
		
		
		
	}

}
// this is multi level inheritance
