package processing.stop;

import main.GeneticManager;
import main.Individual;

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
		Individual currentBest = GeneticManager.getInstance().getCurrentGeneration().get(0);
		
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
