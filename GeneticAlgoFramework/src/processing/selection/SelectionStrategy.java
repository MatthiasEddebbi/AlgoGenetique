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
	
	public abstract List<Individual> Selection(List<Individual> listInd);
		

}
