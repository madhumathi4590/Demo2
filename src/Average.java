import java.util.Arrays;

public class Average {
	public static void main(String[] args) {
		int[] arr=new int[] {12, 4, 34, 23, 9};
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		double avg=sum/(arr.length);
		System.out.println("Average is:"+avg);
	}

}
