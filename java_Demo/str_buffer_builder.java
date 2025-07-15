package java_Demo;
    

public class str_buffer_builder {
	public static void main(String[] args) {
		Long starttime , endtime;
		//STRINGBUFFER
		StringBuffer stringbuffer = new StringBuffer("hello ");
		starttime = System.nanoTime();
		for(int i=0; i>100000; i++) {
		stringbuffer.append("world");
		
	}
		endtime =System.nanoTime();
		System.out.println("the stringbuffer times : " +(endtime - starttime) +"ns");
		
        //STRINGBUILDER
		StringBuilder stringbuilder = new StringBuilder("hello ");
		starttime = System.nanoTime();
		for(int i=0; i>100000; i++) {
		stringbuilder.append("world");
		
	}
		endtime =System.nanoTime();
		System.out.println("the stringbuilder times : " +(endtime-starttime) +"ns");
		
}
}
