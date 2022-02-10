class Pattern8{
	public static void main(String[] args) {
		int row=5;
		int spc=2;
		int str=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=spc;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=str;j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<3){
				spc--;
				str++;
			}else{
			spc++;
			str--;
		}
	}

	}
}