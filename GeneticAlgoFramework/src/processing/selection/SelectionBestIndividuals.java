package processing.selection;

import java.util.ArrayList;
import java.util.List;

import main.Individual;

public class SelectionBestIndividuals extends SelectionStrategy {
	
	public SelectionBestIndividuals(List<Individual> ind) {
		super(ind);
	}

	@Override
	public List<Individual> Selection() {

		if (this.getIndividuals() == null) {
			System.out.print("No Individuals defined in Selection step");
		} else {
			
			List<Individual> newIndividuals = new ArrayList();
			List<Individual> bufIndividuals = getIndividuals();
			
			
			this.setIndividuals(newIndividuals);
			return this.individual;
		}
		return null;
	}

}
