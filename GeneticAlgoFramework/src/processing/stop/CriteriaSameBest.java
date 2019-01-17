package processing.stop;

import main.SingletonGeneticManager;
import main.Individual;

/**
 * @author Alexandre Durandeau
 * @version 1.0
 * @see CriteriaStrategy
 */

public class CriteriaSameBest extends CriteriaStrategy{
	
	private int 		numberIterationsSameBest;
	private int 		currentIterations;
	private Individual 	precedentBest;
	
	public CriteriaSameBest(int numberIterationsSameBestIndividuals)
	{
		this.numberIterationsSameBest = numberIterationsSameBestIndividuals;
	}
	
	public boolean stop()
	{
		Individual currentBest = SingletonGeneticManager.getInstance().getCurrentGeneration().get(0);
		
		if(currentBest != precedentBest)
		{
			this.precedentBest = currentBest;
			return false;
		} else {
			currentIterations +=1;
			
			if(currentIterations > numberIterationsSameBest) {
				return true;
			} else {
				return false;
			}
		}	
	}
}
