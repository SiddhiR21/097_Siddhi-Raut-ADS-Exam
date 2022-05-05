public class InsertionSort{
	
	 void insertionArray(int[]ar){
		int n = ar.length;
		for(int i = 1;i<n; i++){
			int l = ar[i];
			int j = i + 1;
			
			while(j>=0 && ar[j]>l){
				ar[j-1]=ar[j];
					j=j-1;
				
					for(int m=0;m<n;m++){
						System.out.println(ar[m]+" ");
				}
				System.out.println(" ");
			}
						ar[j+1]=l;
	}
	}
		
	public static void main(String args[]){
		InsertionSort si = new InsertionSort();
			int a1[] = {2,4,6,8,3};
		
		si.insertionArray(a1);
		si.display(a1);
		
		
	}
}