package processing.selection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import main.Individual;

/**
 * Concrete Selection strategy, selectionning Best children for a new mutation / crossing generation
 * 
 */
public class SelectionBestIndividuals extends SelectionStrategy {
	
	/**
	 * @param List<Individual> listIng, current generation individual list
	 * @return List<Individual> newIndividual
	 */
	@Override
	public List<Individual> Selection(List<Individual> listInd) {

		if (listInd == null) {
			System.out.print("No Individuals defined in Selection step");
		} else {
			
			List<Individual> newIndividuals = new ArrayList();
			
			listInd.sort(Comparator.comparingDouble(Individual::getScore));
			newIndividuals = listInd.subList(0, listInd.size() - 1); // Copy best individual from current generation minus one parent
			return newIndividuals;
		}
		return null;
	}

}
