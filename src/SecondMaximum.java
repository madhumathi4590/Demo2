import java.util.Arrays;

public class SecondMaximum {
	public static void main(String[] args) {
		int[] arr=new int[] {12, 4, 34, 23, 9};
		Arrays.sort(arr);
		System.out.println("Second Maximum element is:"+arr[arr.length-2]);
	}

}
