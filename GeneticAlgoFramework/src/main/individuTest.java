package main;

public class individuTest extends individu {

	int param;
	
	public individuTest (int value)
	{
		param = value;
	}
	
	@Override
	public double Evaluate() {
		
		return param / 255 ;
		
	}

	@Override
	public void Mute() {
		
		
		
	}

	@Override
	public individu Crossing(individu ind) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString()
	{
		String str ="";
		
		str += "La veleur en byte est " + param + "\n";
		
		str += "La valeur en byte est " + Integer.toString(param,2);
		
		return str;
	}

}
