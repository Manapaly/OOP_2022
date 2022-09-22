public class Temperature{
	private double Value = 0;
	private char Scale = 'C';

	Temperature(){
	}
	Temperature(double Value){
	    this.Value = Value;
	}
	Temperature(char Sc){
	    this.Scale = Sc;
	}
	Temperature(double Value, char Sc){
	    this.Value = Value;
	    this.Scale = Sc;
	}
	public double degreeF(){
	    if(this.Scale.equal('F')){
	        return Value;
	    }else{
	        return (9*(Value/5)+32);
	    }
	}
	public double degreeC(){
	    if(this.Scale.equal('C')){
	        return Value;
	    }else{
	        return (5*(Value-32))/9;
	    }
	}
	public void setValue(double Value){
	    this.Value = Value;''
	}
	public void setScale(char c){
	    if(c.equals('C')){
	        degreeC();
	        this.Scale = c;
	    }else{
	        degreeF();
	        this.Scale = c;
	    }
	}
	public char getScale(){
	    return Scale;
	}
	public String toString(){
	    return (Value + " " + Scale);
	}
}
