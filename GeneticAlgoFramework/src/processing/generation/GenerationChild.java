package processing.generation;

import java.util.List;

import main.Individual;

public class GenerationChild {
	
	protected double mutationRate;

	public GenerationChild(double _mutationRate) {

		mutationRate = _mutationRate;
	}
	
	public List<Individual> GenerateChildList(List<Individual> individualList){
		double threshold;
		int i;
		List<Individual> childList = null;
		for (i=0; i<individualList.size()-1; i++)
		{
			threshold = (double)(Math.random() * (individualList.size() + 1));
			if (threshold <= this.mutationRate) {
				//TODO
			}
			else {
				//TODO
			}
		}
		
		return childList;
	}
}
