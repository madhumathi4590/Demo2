import java.util.Scanner;

public class SwapTwoGivenIndexedElement {
	public static void main(String[] args) {
		int[] arr=new int[] {12, 4, 34, 23, 9};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first index:");
		int firstIndex=sc.nextInt();
		System.out.println("Enter second index:");
		int secondIndex=sc.nextInt();
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		int temp=arr[firstIndex];
		arr[firstIndex]=arr[secondIndex];
		arr[secondIndex]=temp;
		System.out.println();
		System.out.println("New array is:");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}

}
