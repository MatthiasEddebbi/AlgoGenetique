package processing.generation;

import java.util.List;

import main.Individual;

public class GenerationChild {
	
	private List<Individual> individualList;
	protected double mutationRate;

	public GenerationChild(List<Individual> _individualList, double _mutationRate) {

		individualList = _individualList;
		mutationRate = _mutationRate;
	}
	
	public List<Individual> GenerateChildList(){
		double threshold;
		int i;
		List<Individual> childList = null;
		for (i=0; i<this.individualList.size()-1; i++)
		{
			threshold = (double)(Math.random() * (this.individualList.size() + 1));
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
