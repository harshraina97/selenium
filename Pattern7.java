class Pattern7{
	public static void main(String[] args) {
		int row=5;
		int str =1;
		int spc=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=str;j++){
				System.out.print("*");
			}
            System.out.println(); 
			if(i<3){
			str++;
		}else
		str--;
	 }
 }
}