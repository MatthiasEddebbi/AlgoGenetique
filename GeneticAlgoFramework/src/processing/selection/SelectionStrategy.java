package processing.selection;

import java.util.List;

import processing.individual.Individual;

/**
 * Abstract class for the selection of children before next crossing/mutation iteration 
 * @author matthias
 * @version 1.0
 * @see SelectionStrategy
 */
public abstract class SelectionStrategy {
	
	protected int numberOfChildren = 0;
		
	/**
	 * Abstract constructor for Selection step
	 * @param int numberOfChildren
	 */
	public SelectionStrategy(int numberOfChildren) {
	}
	
	/**
	 * Selection Method to implements in concrete strategy
	 * @param listInd, list of current generation individuals
	 * @return List<Individual> new list of individuals
	 */
	public abstract List<Individual> selection(List<Individual> listInd, int desiredNumber);

	public void checkNumberOfChilren(int numberOfParents) {
		if(numberOfParents < numberOfChildren) {
			numberOfChildren = numberOfParents -1;
			System.out.println("The number of children desired is too high considering the number of parents.\n"
					+ "The number of children created will be : " + numberOfChildren);
		}
	}
}