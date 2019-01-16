package main;

public abstract class Individual {

	protected double score;
	
	/**
	 * Empty constructor for initialization
	 */
	public Individual() {}
	
	/**
	 * Function to evaluate the individual and obtain a score, the best solution is the one with the minimal score
	 * @return Double to represent the "score" of the individual
	 */
	public abstract double Evaluate();
	
	/**
	 * Function to mutate the individual
	 */
	public abstract  void Mutate();
	
	/**
	 * Function to create a new individual from two individuals
	 * @param ind Second individual for the merging
	 * @return New individual obtain from two parents
	 */
	public abstract Individual Crossing(Individual ind);

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
