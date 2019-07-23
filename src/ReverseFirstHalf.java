
public class ReverseFirstHalf {
	public static void main(String[] args) {
		int[] arr=new int[] {12, 4, 34, 23, 9};
		int firsthalf=arr.length/2;
		for(int i=firsthalf;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
