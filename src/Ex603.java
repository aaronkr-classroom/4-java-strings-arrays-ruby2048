
public class Ex603 {

	public static void main(String[] args) {
		double[][] MyGrades = new double[][] {{89.1, 88.2, 83.2, 85.8, 75.2}, {95.0, 93.2, 91.1, 89.9, 75.2}, {87.7, 89.9, 75.2, 88.2, 83.2}, {88.3, 89.9, 75.2, 88.2, 75.2}, {100.0, 88.3, 89.9, 75.2, 88.2}};
		String[] myClasses = new String[] {"국어", "수학", "공학", "사회", "PE"};
		
		for (int i = 0; i < myClasses.length; i++) {
			System.out.print(myClasses[i] + " : ");
			for (int j = 0; j < 5; j++) {
				System.out.print(MyGrades[i][j] + ", ");
			}
			System.out.println();
		}
		double sum = 0.0;
		double avg = 0.0;
		
		/*
		for (double g : MyGrades) {
			sum += g;
		}
		avg = sum / MyGrades.length;
		
		System.out.println("합계 : " + sum);
		System.out.format("평균 : %.2f", avg);
		*/
	}
}
