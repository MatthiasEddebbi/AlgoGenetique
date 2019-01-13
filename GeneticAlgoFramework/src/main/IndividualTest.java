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
		
		score = Math.abs((double)((31 - param))) / (double)31;
		score = score * 100;
		return score;
	}

	@Override
	public void Mutate() {
		
		param = param << 1 ;
		
	}

	@Override
	public Individual Crossing(Individual ind) {
		
		int parent2_value =  ((IndividualTest)ind).GetParam();
		
		int result = param&parent2_value;
		
		return new IndividualTest(result);
	}
	
	public String toString()
	{
		String str ="";
		
		str += "La veleur en decimal est " + param + "\n";
		
		str += "La valeur en byte est " + Integer.toString(param,2) + "\n";
		
		str += "L'evaluation est de : " + score + "\n";
		
		str += "*************************\n";
		return str;
	}

}
