package processing.replace;

import java.util.Comparator;
import java.util.List;

import processing.individual.Individual;

/**
 * After the creation of a List of children, this class implements a new List with the top score elements from both Lists parents and children.
 * @author Alex Charbonnier
 * @version 1.0
 * @see Individual, ReplaceStrategy
 */
public class ReplaceBest extends ReplaceStrategy{
	
	public ReplaceBest() {
		
	}
	
	/**
	 * replace implementation giving only best children of current iteration
	 * @param List<Individual> parentList
	 * @param List<Individual> childList
	 * @return List<Individual> new list of individuals sorted by best score
	 */
	@Override
	public List<Individual> replace(List<Individual> parentList, List<Individual> childList) {
		
		int length;
		
		length = parentList.size();
		
		parentList.sort(Comparator.comparingDouble(Individual::getScore));
		
		for (Individual child : childList) {
			
			child.evaluate();
			Individual worseParent = parentList.get(parentList.size()-1);
			
			if(worseParent.getScore() < child.getScore()) {
				
				parentList.set(length-1, child);
				parentList.sort(Comparator.comparingDouble(Individual::getScore));
			}
		}
		return parentList;
	}
}
