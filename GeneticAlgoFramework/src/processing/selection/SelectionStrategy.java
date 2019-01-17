package processing.selection;

import java.util.List;

import main.Individual;

/**
 * Abstract class for the selection of children before next crossing/mutation iteration 
 *
 */
public abstract class SelectionStrategy {
		
	/**
	 * Abstract constructor for Selection step
	 * @param List<Individual> ind 
	 */
	public SelectionStrategy() {
	}
	
	/**
	 * Selection Method to implements in concrete strategy
	 * @param listInd, list of current generation individuals
	 * @return List<Individual> new list of individuals
	 */
	public abstract List<Individual> selection(List<Individual> listInd, int desiredNumber);
}