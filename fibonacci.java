package week2.day1;
public class fibonacci {
	public static void main(String[] args) {
		int FirstNum=0;
		int SecondNum=1;
		int sum=0;
		System.out.println("first number is"+FirstNum+"\n"+"second number is"+SecondNum+"\n");
		System.out.println("fibonacci series");
			for (int i = 1; i <=11; i++) {
			sum=FirstNum+SecondNum;
		System.out.println(sum);
		FirstNum=SecondNum;
		SecondNum=sum;
			}
		
	}

}
