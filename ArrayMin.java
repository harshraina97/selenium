class ArrayMin{
	public static void main(String[] args) {
		int[]arr={4,1,5,3,2};
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Lowest value is " + min);
	}
}