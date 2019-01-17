package processing.selection;

import java.util.List;

import main.Individual;

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

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
}