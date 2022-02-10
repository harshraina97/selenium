class ArrayMax{
	public static void main(String[] args) {
		int[]arr={4,1,5,3,2};
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("Highest value is " + max);
	}
}