package processing.selection;

import java.util.List;

import main.Individual;

/**
 * Abstract class for the selection of children before next crossing/mutation iteration 
 *
 */
public abstract class SelectionStrategy {
	
	private List<Individual> individual;
	private int desiredNumberOfChildren;
	
	/**
	 * Abstract constructor for Selection step
	 * @param List<Individual> ind 
	 */
	public SelectionStrategy(List<Individual> ind) {
		this.individual = ind;
		desiredNumberOfChildren = 0;
	}

	public List<Individual> getIndividuals() {
		return individual;
	}

	public void setIndividuals(List<Individual> ind) {
		this.individual = ind;
	}

	public int getDesiredNumberOfChildren() {
		return desiredNumberOfChildren;
	}

	public void setDesiredNumberOfChildren(int desiredNumberOfChildren) {
		this.desiredNumberOfChildren = desiredNumberOfChildren;
	}
	
	
	
	public abstract List<Individual> Selection();
		

}
