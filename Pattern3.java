class Pattern3{
	public static void main(String[] args) {
		int row=3;
		int spc=2;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=spc;j++){
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
			
			System.out.println();
			 spc--;
		}
	}		
}	