package main;

public abstract class individu {

	public individu() {}
	
	public abstract double Evaluate();
	
	public abstract  void Mute();
	
	public abstract individu Crossing(individu ind);
}
