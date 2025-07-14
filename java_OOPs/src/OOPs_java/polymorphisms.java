package OOPs_java;



class poly {
	
	 void add(int a , int b){
		System.out.println(a+b);}
		 void add(String a , String b) {
			System.out.println(a+b);
		}
		
		public static void main(String[] args) {
			poly myadd = new poly();
			myadd.add(1,2);
			myadd.add("hii","welcome");
			
		}
		
	}



