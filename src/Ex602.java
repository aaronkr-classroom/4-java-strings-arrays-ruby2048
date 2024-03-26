
public class Ex602 {

	public static void main(String[] args) {
		int[] myNums = new int[10];
		
		for (int i = 0; i < myNums.length; i++) {
			myNums[i] = i * i;
		}
		for (int i = 0; i < myNums.length; i++) {
			System.out.println(i + " : " + myNums[i]);
		}
	}
}