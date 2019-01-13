package processing.generation;

import java.util.ArrayList;
import java.util.List;

import main.Individual;

public class GenerationChild {
	
	protected double mutationRate;
	protected int wantedChild; //cannot be more than the number of parents - 1 

	public GenerationChild(double _mutationRate, int _wantedChild) {

		mutationRate = _mutationRate;
		wantedChild = _wantedChild;
	}
	
	public List<Individual> GenerateChildList(List<Individual> individualList){
		double threshold;
		int i, j, k;
		Individual individualChild;
		List<Individual> childList = new ArrayList<Individual>();
		
		for (i=0; i<wantedChild; i++)
		{
			j = (int)(Math.random() * individualList.size());
			k = (int)(Math.random() * individualList.size());
			individualChild = individualList.get(j).Crossing(individualList.get(k));
			threshold = (double)(Math.random() * (100 + 1));
			if (threshold <= this.mutationRate) {
				individualChild.Mutate();
			}
			childList.add(individualChild);
		}
		return childList;
	}
}
