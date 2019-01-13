package processing.selection;

import java.util.ArrayList;
import java.util.List;

import main.Individual;

/**
 * Concrete Selection strategy, selectionning Random children for a new mutation / crossing generation
 * 
 */
public class SelectionRandom extends SelectionStrategy {

	/**
	 * @param List<Individual> listIng, current generation individual list
	 * @return List<Individual> newIndividual
	 */
	@Override
	public List<Individual> Selection(List<Individual> listInd, int desiredNumber) {

		//listInd must be given
		if (listInd == null) {
			System.out.print("No Individuals defined in Selection step");
		} else {
			
			List<Individual> newIndividuals = new ArrayList();
			List<Individual> bufIndividuals = listInd;
			
			int index = 0;
			for(int i = 0; i < desiredNumber + 1; i++) {
				index = (int)(Math.random() * bufIndividuals.size());
				newIndividuals.add(bufIndividuals.get(index));
				bufIndividuals.remove(index);  //remove this item to avoid having doubled item in newIndividual
			}
			return newIndividuals;
			
		}
		return null;
	}

}
