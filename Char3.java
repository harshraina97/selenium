class Char3{
	public static void main(String[] args) {
		int row=5;
		int str=1;
		char c='A';
		for(int i=1;i<=row;i++){
			c='A';
			for(int j=1;j<=i;j++){
				System.out.print(c +" ");
				c++;
			}
		        System.out.println();
		}
	}
}