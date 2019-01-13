package processing.selection;

import java.util.ArrayList;
import java.util.List;

import main.Individual;

public class SelectionRandom extends SelectionStrategy {

	
	public SelectionRandom(List<Individual> ind) {
		super(ind);
	}

	@Override
	public List<Individual> Selection() {

		if (this.getIndividuals() == null) {
			System.out.print("No Individuals defined in Selection step");
		} else {
			
			List<Individual> newIndividuals = new ArrayList();
			List<Individual> bufIndividuals = getIndividuals();
			
			int index = 0;
			for(int i = 0; i < this.desiredNumberOfChildren - 1; i++) {
				index = (int)Math.random() * bufIndividuals.size();
				newIndividuals.add(bufIndividuals.get(index));
				bufIndividuals.remove(index);
			}
			this.setIndividuals(newIndividuals);
			return this.individual;
		}
		return null;
	}

}
