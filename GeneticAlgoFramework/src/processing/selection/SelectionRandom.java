package processing.selection;

import java.util.List;

import main.Individual;

public class SelectionRandom extends SelectionStrategy {
	
	private List<Individual> ind;

	@Override
	public List<Individual> Selection() {
		if(this.getIndividuals() == null) {
			throw new Exception("No Individuals defined in Selection step");
		}
		else {
			try {
				
			}
			catch{
				
			}
		}
		return null;
	}

}
