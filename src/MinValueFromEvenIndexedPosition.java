import java.util.Arrays;

public class MinValueFromEvenIndexedPosition {
	public static void main(String[] args) {
	int[] arr=new int[] {12, 4, 34, 23, 9};
	int[] newarr=new int[arr.length/2+1];
	int j=0;
	System.out.println("New Array is:");
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			newarr[j]=arr[i];
			j++;
		}
	}
	Arrays.sort(newarr);
	System.out.println("Minimum value is:"+newarr[0]);
	}

}
