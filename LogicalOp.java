class LogicalOp{
	public static void main(String[] args) {
		int a=10;
		int b=15;
		boolean res1=(a<b)&&(++b>a);
		System.out.println("Result: "+res1);
		boolean res2=(a>b)||(a<b);
		System.out.println("Result: "+res2);
	}
}