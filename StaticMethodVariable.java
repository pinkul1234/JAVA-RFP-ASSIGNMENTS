class StaticMethodVariable{
	static int num;
	static{
		System.out.println("STATIC BLOCK");
	}
	static void method(){
		System.out.println("STATIC METHOD");
	}
	public static void main(String arg[]){
		System.out.println("BEFORE VALUE OF NUM: "+num);
		num=10;
		System.out.println("AFTER VALUE OF NUM: "+num);
		method();
	}
	
}