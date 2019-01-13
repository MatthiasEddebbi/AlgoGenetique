package processing.selection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import main.Individual;

public class SelectionBestIndividuals extends SelectionStrategy {
	
	@Override
	public List<Individual> Selection(List<Individual> listInd) {

		if (listInd == null) {
			System.out.print("No Individuals defined in Selection step");
		} else {
			
			List<Individual> newIndividuals = new ArrayList();
			
			listInd.sort(Comparator.comparingDouble(Individual::getScore));
			newIndividuals = listInd.subList(0, listInd.size() - 1);
		}
		return null;
	}

}
