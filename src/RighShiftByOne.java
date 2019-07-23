
public class RighShiftByOne {
	public static void main(String[] args) {
		int[] arr=new int[] {12, 4, 34, 23, 9};
		int len=arr.length;
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		int temp=arr[len-1];
		for(int i=len-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.println();
		System.out.println("New Array is:");
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
