package processing.selection;

import java.util.ArrayList;
import java.util.List;

import main.Individual;

public class SelectionRandom extends SelectionStrategy {

	@Override
	public List<Individual> Selection(List<Individual> listInd) {

		if (listInd == null) {
			System.out.print("No Individuals defined in Selection step");
		} else {
			
			List<Individual> newIndividuals = new ArrayList();
			List<Individual> bufIndividuals = listInd;
			
			int index = 0;
			for(int i = 0; i < listInd.size() - 1; i++) {
				index = (int)Math.random() * bufIndividuals.size();
				newIndividuals.add(bufIndividuals.get(index));
				bufIndividuals.remove(index);
			}
			
		}
		return null;
	}

}
