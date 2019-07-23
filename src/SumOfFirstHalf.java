
public class SumOfFirstHalf {
	public static void main(String[] args) {
		int[] arr=new int[] {12, 4, 34, 23, 9};
		int sum=0;	
		int firsthalf=arr.length/2;
		for(int i=0;i<=firsthalf;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of First half is:"+sum);
}
}
