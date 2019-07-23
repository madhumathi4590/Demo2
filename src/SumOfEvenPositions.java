
public class SumOfEvenPositions {
	public static void main(String[] args) {
		int[] arr=new int[] {12, 4, 34, 23, 9};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum is:"+sum);
	}
}
