package processing.generation;

import java.util.ArrayList;
import java.util.List;

import main.Individual;

public class GenerationChild {
	
	protected double 	mutationRate;
	protected int 		wantedChild; //cannot be more than the number of parents - 1 

	/**
	 * 
	 * @param mutationRate The percentage of occurrence of a mutation (0-100)
	 * @param wantedChild  The number of child created from the parents
	 */
	public GenerationChild(double mutationRate, int wantedChild) {

		this.mutationRate = mutationRate;
		this.wantedChild = wantedChild;
	}
	
	/**
	 * 
	 * @param individualList List of Individuals corresponding to the parents
	 * @return List<Individual> of children implemented thanks to mutation and crossing concepts
	 */
	public List<Individual> generateChildList(List<Individual> individualList) {
		
		double 		threshold;
		
		int 		j;
		int 		k;
		int 		length;
		
		Individual 	individualChild;
		
		List<Individual> childList = new ArrayList<Individual>();
		
		length = individualList.size();
		
		checkCapacityChildGeneration(length);
		
		for (int i=0; i<wantedChild; i++) {
			
			j = (int)(Math.random() * length);
			k = (int)(Math.random() * length);
			
			individualChild = individualList.get(j).crossing(individualList.get(k));
			
			threshold = (double)(Math.random() * (100 + 1));
			
			if (threshold <= mutationRate) {
				individualChild.mutate();
			}
			
			childList.add(individualChild);
		}
		
		return childList;
	}
	
	/**
	 * Function that will check check if the number of children desired is possible
	 * @param numberParents Number of parent in the population
	 */
	private void checkCapacityChildGeneration(int numberParents) {
		
		if(wantedChild >= numberParents) {
			wantedChild = numberParents - 1;
			System.out.println("The number of wanted chilren is superior to the number of parents.\nThe numbre of children created will be equal to the number of parents minus one.");
		}
	}
}