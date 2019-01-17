package main;

import processing.individual.Individual;

public class IndividualTest extends Individual {

	double param;
	
	public IndividualTest (double value)
	{
		param = value;
	}
	
	public double GetParam()
	{
		return param;
	}
	
	@Override
	public double evaluate() {
		
		score = (double)param * (double)param + 2;
		return score;
	}

	@Override
	public void mutate() {
		
		param = param - 0.1;
		
	}

	@Override
	public Individual crossing(Individual ind) {
		
		double parent2_value =  ((IndividualTest)ind).GetParam();
		
		double result = (param + parent2_value)/2;
		
		return new IndividualTest(result);
	}
	
	public String toString()
	{
		String str ="";
		
		str += "La valeur en decimal est " + param + "\n";
		
		str += "L'evaluation est de : " + score + "\n";
		
		str += "*************************\n";
		return str;
	}

}
