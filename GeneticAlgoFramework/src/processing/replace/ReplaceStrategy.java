package processing.replace;

import java.util.List;

import main.Individual;

public abstract class ReplaceStrategy {

	/**
	 * Abstract constructor for the Replace step
	 * @param List<Individual> ind 
	 */
	
	public ReplaceStrategy() {
	}
	
	public abstract List<Individual> Replace(List<Individual> parentList, List<Individual> childList);
}
