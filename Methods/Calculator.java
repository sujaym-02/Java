class Calculator{

	public static void main(String arithmetic[]){

		add(5,5);
		sub(50,49);
		mul(50,10);
		div(50,2);
		mod(10,2);


}
	public static void add(int num1,int num2){
	int sum = num1+num2;
	System.out.println(sum);
	}

	public static void sub(int sub1,int sub2){
	int difference = sub1 - sub2;
	System.out.println (difference);
	}

	public static void mul(int mul1,int mul2){
	int mult = mul1 * mul2;
	System.out.println(mult);
	}
	
	public static void  div(float div1,float div2){
	float division = div1 / div2;
	System.out.println(division);
	}
	

	public static void mod(float mod1,float mod2){
	float modulus = mod1 % mod2;
	System.out.println(modulus);
	}

}