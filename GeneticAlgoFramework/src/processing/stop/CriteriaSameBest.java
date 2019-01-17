package processing.stop;

import main.SingletonGeneticManager;
import main.Individual;

/**
 * @author Alexandre Durandeau
 * @version 1.0
 * @see CriteriaStrategy
 */

public class CriteriaSameBest extends CriteriaStrategy{
	
	private int numberIterationsSameBest;
	private int currentIterations;
	private Individual precedentBest;
	
	public CriteriaSameBest(int numberIterationsSameBestIndividuals)
	{
		numberIterationsSameBest = numberIterationsSameBestIndividuals;
	}
	
	public boolean Stop()
	{
		Individual currentBest = SingletonGeneticManager.getInstance().getCurrentGeneration().get(0);
		
		if(currentBest != precedentBest)
		{
			precedentBest = currentBest;
			return false;
		}
		else
		{
			currentIterations +=1;
			
			if(currentIterations > numberIterationsSameBest)
			{
				return true;
			}
			else
			{
				return false;
			}
		}	
	}
}
