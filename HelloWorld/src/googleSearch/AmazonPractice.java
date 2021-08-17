package googleSearch;

public class AmazonPractice {
	
	public void reverse(int numArray[]) {
		System.out.println("Original Array: ");
		for(int i=0;i<numArray.length;i++) {
			System.out.println(numArray[i]+ " ");
		}
		System.out.println();
		System.out.println("Reversed array ");
		for(int i=numArray.length-1;i>=0;i--) {
			System.out.println(numArray[i]+ "");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonPractice am=new AmazonPractice();
		am.reverse(new int[]{1,2,3,4,5});

	}


}
