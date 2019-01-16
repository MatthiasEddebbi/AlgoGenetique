package processing.replace;

import java.util.List;

import main.Individual;

public abstract class ReplaceStrategy {

	/**
	 * Abstract constructor for the Replace step
	 * @param List<Individual> parentList
	 * @param List<Individual> childList 
	 * @return List<Individual> mix of children and parents through a random or a best strategy
	 */

	public ReplaceStrategy() {
	}
	
	public abstract List<Individual> Replace(List<Individual> parentList, List<Individual> childList);
}