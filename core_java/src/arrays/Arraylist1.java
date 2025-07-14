package arrays;
import java.util.ArrayList;

class Arraylist1{
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		
		//add () method
		arr.add("java");
		arr.add(0, "python");
		arr.addFirst("html");
		arr.add("js");
		arr.addLast("react");
		arr.add("css");
		arr.add("apache");
		arr.add("sql");
		System.out.println("the list of the element: " +arr);
		//get() method
		String s = arr.get(1);
		String t = arr.get(3);
		
		System.out.println("to element: " +s);
		System.out.println("to get element: " +t);
		//set ()method
		String lis = arr.set(5, "net");
		System.out.println("set of element: " +arr);
		String lis1 = arr.set(4, "c++");
		System.out.println("set of element: " +arr);
		//remove() method
		String lis2 = arr.removeLast();
		System.out.println("after removing the element in list: " +arr);
		String lis3 = arr.removeFirst();
		System.out.println("after removing the element in list: " +arr);
	
		
	}
}