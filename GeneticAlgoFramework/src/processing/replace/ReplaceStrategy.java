package processing.replace;

import java.util.List;

import processing.individual.Individual;

/**
 * Abstract class for the Replace step
 * 
 * @author Alex Charbonnier
 * @version 1.0
 * @see ReplaceBest, ReplaceRandom
 */
public abstract class ReplaceStrategy {

	/**
	 * Abstract constructor for the Replace step
	 */

	public ReplaceStrategy() {
	}

	/**
	 * Abstract class of the Replace step
	 * 
	 * @param List<Individual> parentList
	 * @param List<Individual> childList
	 * @return List<Individual> mix of children and parents through a random or a
	 *         best strategy
	 */
	public abstract List<Individual> replace(List<Individual> parentList, List<Individual> childList);
}