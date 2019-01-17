package processing.individual;

/**
 * 
 * Abstract class giving the methods to implement to create a custom individual
 * with specific methods to evaluate, mutate and mate
 * 
 * @author Jeremy Chopin
 * @version 1.0
 *
 */
public abstract class Individual {

	protected double score;

	/**
	 * Empty constructor for initialization
	 */
	public Individual() {

	}

	/**
	 * Function to evaluate the individual and obtain a score, the best solution is
	 * the one with the minimal score
	 * 
	 * @return Double to represent the "score" of the individual
	 */
	public abstract double evaluate();

	/**
	 * Function to mutate the individual
	 */
	public abstract void mutate();

	/**
	 * Function to create a new individual from two individuals
	 * 
	 * @param ind Second individual for the merging
	 * @return New individual obtain from two parents
	 */
	public abstract Individual crossing(Individual ind);

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
