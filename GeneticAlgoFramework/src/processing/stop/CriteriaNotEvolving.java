package processing.stop;
import java.util.List;

import main.SingletonGeneticManager;
import main.Individual;

/**
 * @author Alexandre Durandeau
 * @version 1.0
 * @see CriteriaStrategy
 */

public class CriteriaNotEvolving extends CriteriaStrategy {
	
	private int 				iterations;
	private int 				nbIterations;
	private List<Individual> 	oldGeneration;
	
	public CriteriaNotEvolving(int iterations)
	{
		oldGeneration = SingletonGeneticManager.getInstance().getCurrentGeneration();
		this.iterations = iterations;
		this.nbIterations = 0;
	}
	
	public boolean stop()
	{
		nbIterations ++;
		
		if (oldGeneration == SingletonGeneticManager.getInstance().getCurrentGeneration() && nbIterations > iterations) {
			return true;
		} else {
			oldGeneration = SingletonGeneticManager.getInstance().getCurrentGeneration();
			return false;
		}
	}
}
