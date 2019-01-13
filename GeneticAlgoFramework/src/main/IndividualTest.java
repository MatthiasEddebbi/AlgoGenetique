package main;

public class IndividualTest extends Individual {

	int param;
	
	public IndividualTest (int value)
	{
		param = value;
	}
	
	public int GetParam()
	{
		return param;
	}
	
	@Override
	public double Evaluate() {
		
		return (param*100 / 31);
		
	}

	@Override
	public void Mutate() {
		
		param = param << 1 ;
		
	}

	@Override
	public Individual Crossing(Individual ind) {
		
		int parent2_value =  ((IndividualTest)ind).GetParam();
		
		
		int result = param|parent2_value;
		
		return new IndividualTest(result);
	}
	
	public String toString()
	{
		String str ="";
		
		str += "La veleur en byte est " + param + "\n";
		
		str += "La valeur en byte est " + Integer.toString(param,2);
		
		return str;
	}

}
