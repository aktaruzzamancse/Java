import java.util.Scanner;//*Importing scanner class for input from keyboard.*//
public class Calculator { //Declare Calculator class

	 public static void main(String[] args) {
		int nub1;
		int nub2;
		Calculator cal = new Calculator();
		Scanner keyinput = new Scanner(System.in);
		System.out.println("Please input two number for Calculation.");
		nub1 =keyinput.nextInt(); 
		nub2 =keyinput.nextInt();
		cal.addition(nub1,nub2);
	}
	 public void addition (int a,int b){
		int addition;
		addition = a+b;
		System.out.println("Addition Result = "+addition);
	}

}
