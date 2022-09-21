public class Data {
	public double LargestDigit = Integer.MIN_VALUE;
	public int NumOfDigits = 0;
	public double SumOfDigits = 0;
	
	Data(){
	}
	
	public void AddData(double Digit){
	    if(Digit > LargestDigit){
	        LargestDigit = Digit;
	    }
	    SumOfDigits+=Digit;
	    NumOfDigits++;
	}

	
	
}
