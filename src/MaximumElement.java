import java.util.Arrays;

public class MaximumElement {
	public static void main(String[] args) {
		int[] arr=new int[] {12, 4, 34, 23, 9};
		Arrays.sort(arr);
		System.out.println("Minimum element is:"+arr[arr.length-1]);
	}

}
