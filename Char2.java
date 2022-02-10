class Char2{
	public static void main(String[] args) {
		int row=3;
		int str=1;
		char c='A';
		int spc=2;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=spc;j++){
				System.out.print(" ");
			   }
                for(int j=1;j<=str;j++){
				System.out.print(c+ " ");
				c++;
            }
			System.out.println();
            str++;
            spc--;
        }
	}
}