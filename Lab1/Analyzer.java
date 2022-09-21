public class Analyzer {
	public double Avarage = 0;
	public double Maximum = 0;
	Analyzer(){
	}
	
	public double GetAvarageFromData(Data D){
	    if(D.LargestDigit==Integer.MIN_VALUE){
	        return 0;
	    }else{
	        return D.SumOfDigits/D.NumOfDigits;
	    }

	}
	public double GetMaximumFromData(Data D){
	    if(D.LargestDigit==Integer.MIN_VALUE){
	        return 0;
	    }else{
	        return D.LargestDigit;
	    }
	    
	}

}
