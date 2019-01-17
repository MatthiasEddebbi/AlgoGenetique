package processing.selection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import processing.geneticManager.SingletonGeneticManager;
import processing.individual.Individual;

/**
 * Concrete Selection strategy, selectionning Best children for a new mutation /
 * crossing generation
 * @author matthias
 * @version 1.0
 * @see SelectionRandom, SelectionBest
 * 
 */
public class SelectionBest extends SelectionStrategy {

	public SelectionBest(int numberOfChildren) {
		super(numberOfChildren);
	}

	/**
	 * @param List<Individual> listIng, current generation individual list
	 * @return List<Individual> newIndividual
	 */
	@Override
	public List<Individual> selection(List<Individual> listInd, int desiredNumber) {

		// Evaluate fonction of each individuals before selection
		
		if (listInd == null) {
			System.out.print("No Individuals defined in Selection step");
		} else {

			for (Individual ind : listInd) {
				ind.evaluate();
			}
			
			List<Individual> newIndividuals = new ArrayList();

			listInd.sort(Comparator.comparingDouble(Individual::getScore).reversed());
			
			newIndividuals = listInd.subList(0, desiredNumber); // Copy best individual from current generation minus
																// one parent
			return newIndividuals;
		}
		return null;
	}
}
