package processing.generation;

import java.util.ArrayList;

import java.util.List;

import processing.individual.Individual;

/**
 * Generate children List using crossing and mutation 
 * @author Alex Charbonnier
 * @version 1.0
 * @see Individual
 */

public class GenerationChild {
	
	private double 		mutationRate;

	/**
	 * 
	 * @param mutationRate The percentage of occurrence of a mutation (0-100)
	 * @param wantedChild  The number of child created from the parents
	 */
	public GenerationChild(double mutationRate) {

		this.mutationRate = mutationRate;
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
		
		for (int i=0; i<length-1; i++) {
			
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
}