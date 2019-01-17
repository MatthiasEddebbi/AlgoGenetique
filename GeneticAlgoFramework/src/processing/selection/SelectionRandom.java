package processing.selection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.Individual;
import main.SingletonGeneticManager;

/**
 * Concrete Selection strategy, selectionning Random children for a new mutation / crossing generation
 * @author matthias
 * @version 1.0
 * @see SelectionStrategy
 * 
 */
public class SelectionRandom extends SelectionStrategy {

	public SelectionRandom(int numberOfChildren) {
		super(numberOfChildren);
		if(numberOfChildren > SingletonGeneticManager.getInstance().getCurrentGeneration().size()) {
			System.out.print("number of children was to high, set to number of parent if current generation -1");
			this.numberOfChildren = SingletonGeneticManager.getInstance().getCurrentGeneration().size() -1;
		}
	}

	/**
	 * @param List<Individual> listIng, current generation individual list
	 * @return List<Individual> newIndividual
	 */
	@Override
	public List<Individual> selection(List<Individual> listInd, int desiredNumber) {

		// listInd must be given
		if (listInd == null) {
			
			System.out.print("No Individuals defined in Selection step");
			
		} else {

			// Evaluate fonction of each individuals before selection
			for (Individual ind : listInd) {
				ind.evaluate();
			}
			
			List<Individual> newIndividuals = new ArrayList();
			List<Individual> bufIndividuals = new ArrayList(listInd);
			
			int index;
			int length;
			
			index = 0;
			length = bufIndividuals.size();
			
			for (int i = 0; i < desiredNumber; i++) {
				
				index = (int) (Math.random() * length);
				
				newIndividuals.add(bufIndividuals.get(index));
				bufIndividuals.remove(index); // remove this item to avoid having doubled item in newIndividual
			}
			
			return newIndividuals;
		}
		return null;
	}
}
