import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of data"+ " ");
		int array_size=sc.nextInt();
		int N[]= new int[array_size];
		
		System.out.print("Enter the numbers"+" ");
		for(int i=0;i<N.length;i++) {
			N[i]=sc.nextInt();
			System.out.print("Original array:"+N[i]);
			
			if(N[i]%2==0) {
			    int even=N[i]*N[i]*N[i];
			    System.out.println("Even Array:"+even);
			}
			else
			    {
			    	int odd=N[i]*N[i];
				    System.out.println("Odd Array:"+odd);
		    	
		    }
			
			 
			}
		}
	}

