class BitwiseOp{
	public static void main(String[] args) {
		int a=15;
		int b=20;
		boolean res1=(a>b)&(a!=b);
		System.out.println("Result: "+res1);
		boolean res2=(a>b)|(b>a);
		System.out.println("Result: "+res2);
		boolean res3=(a>b)^(b>a);
		System.out.println("Result: "+res3);
	}
}

 