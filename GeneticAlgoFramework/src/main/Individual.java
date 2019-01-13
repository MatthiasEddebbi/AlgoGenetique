package main;

public abstract class Individual {

	public Individual() {}
	
	public abstract double Evaluate();
	
	public abstract  void Mute();
	
	public abstract Individual Crossing(Individual ind);
}
