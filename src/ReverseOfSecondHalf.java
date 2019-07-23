
public class ReverseOfSecondHalf {
	public static void main(String[] args) {
		int[] arr=new int[] {12, 4, 34, 23, 9};
		int secondhalf=arr.length/2;
		for(int i=arr.length-1;i>secondhalf;i--) {
			System.out.println(arr[i]);
		}
	}

}
