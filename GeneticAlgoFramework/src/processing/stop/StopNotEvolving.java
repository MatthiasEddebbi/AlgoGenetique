package processing.stop;
import java.util.List;

import main.GeneticManager;
import main.Individual;

public class StopNotEvolving extends StopStrategy {
	
	private int iterations;
	private int nbIterations = 0;
	private GeneticManager gm;
	private List<Individual> oldGeneration;
	
	public StopNotEvolving(int iterations)
	{
		oldGeneration = gm.getInstance().getCurrentGeneration();
		this.iterations = iterations;
	}
	
	public boolean Stop()
	{
		nbIterations ++;
		
		if (gm.getInstance().getCurrentGeneration() == oldGeneration && nbIterations == iterations)
		{
			return true;
		}
		else
		{
			oldGeneration = gm.getInstance().getCurrentGeneration();
			return false;
		}
	}

}
