import java.util.*;
public class LargestEvenNumber {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int n=in.nextInt();
		int ar1[]=new int[(int)Math.log10(n)+1];
		int ar[]=new int[ar1.length];
		int k=0;
		while(n!=0){
		    ar1[k++]=n%10;
		    n/=10;
		}
	    Arrays.sort(ar1);
	    int h=0;
	    for(int i=ar1.length-1;i>=0;i--) {
	    	ar[i]=ar1[h++];
	    }
	    
	    int temp=0;
	    int f=0;
	    int flag=0;
		if(ar[ar.length-1]%2!=0) {
			for(int i=ar.length-1;i>=0;i--) {
				if(ar[i]%2==0) {
					flag=1;
					f=i;
					temp=ar[i];
					break;
				}
			}
		}
		if(flag==1) {
			for(int i=f;i<ar.length-1;i++){
			    ar[i]=ar[i+1];
			}
			ar[ar.length-1]=temp;
		}
		System.out.println("Largest Even Number From The Given Number :");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]);
		}
	   

	}
}