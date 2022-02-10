import java.util.Scanner;
class PrimeNo{
	public static void main(String[] args) {
		Scanner sc=sc.new Scanner(System.in);
	 System.out.println("Enter a number");
	       int n=sc.nextInt();
         for(i=2;i<=n-1;i++){
         	if(n % i == 0)
         		System.out.println("no. is not prime no.");
         }else{
         	System.out.println("no. is prime no.");s
         }
           
                  
 	}
}