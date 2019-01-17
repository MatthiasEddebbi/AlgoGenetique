package processing.replace;

import java.util.Comparator;
import java.util.List;

import main.Individual;

/**
 * After the creation of a List of children, this class implements a new List with random elements from both Lists parents and children and the best from the parents List.
 * @author Alex Charbonnier
 * @version 1.0
 * @see Individual, ReplaceStrategy
 */

public class ReplaceRandom extends ReplaceStrategy{

	@Override
	public List<Individual> replace(List<Individual> parentList, List<Individual> childList) {
		
		int rand;
		int length;
		int i;

		length = parentList.size();
		
		for (i=0; i<childList.size(); i++) {
			
			parentList.sort(Comparator.comparingDouble(Individual::getScore).reversed());
			rand = 1 + (int)(Math.random() * length);
			parentList.add(rand, childList.get(i));
		}
		
		return parentList;
	}
}
