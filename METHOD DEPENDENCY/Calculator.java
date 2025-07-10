class Calculator{

	public static int add(int num1,int num2){
	int sum = num1+num2;
	System.out.println(num1+" + "+num2+" =" +sum+"\n");
	return sum;
	}

	public static int sub(int sub1,int sub2){
	int difference = sub1 - sub2;
	System.out.println(sub1+" - "+sub2+" =" +difference+"\n");
	return difference;
	}

	public static int mul(int mul1,int mul2){
	int mult = mul1 * mul2;
	System.out.println(mul1+" * "+mul2+" =" +mult+"\n");
	return mult;
	}
	
	public static float  div(float div1,float div2){
	float division = div1 / div2;
	System.out.println(div1+" / "+div2+" =" +division+"\n");
	return division;
	}
	

	public static float mod(float mod1,float mod2){
	float modulus = mod1 % mod2;
	System.out.println(mod1+" % "+mod2+" =" +modulus+"\n");
	return modulus;
	}

}