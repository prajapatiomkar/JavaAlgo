//Bubble Sort
package arrays;
public class Simple_Bubble_Sort {
	public static void main(String[] args) {
		
		int a[]= {5,7,3,-1,8,0,1};
		int n=a.length;
		for(int i=0; i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j+1]<a[j]) {
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array is");
		for(int item:a) {
			System.out.print(item+" ");
		}
	}
}

//Written by Prajapati omkar
