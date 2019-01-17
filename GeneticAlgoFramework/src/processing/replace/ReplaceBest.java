package processing.replace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import main.Individual;

/**
 * After the creation of a List of children, this class implements a new List with the top score elements from both Lists parents and children.
 * @author Alex Charbonnier
 * @version 1.0
 * @see Individual, ReplaceStrategy
 */
public class ReplaceBest extends ReplaceStrategy{
	
	public ReplaceBest() {
		
	}
	
	public List<Individual> Replace(List<Individual> parentList, List<Individual> childList){
		
		parentList.sort(Comparator.comparingDouble(Individual::getScore));
		
		for (Individual child : childList) 
		{
			child.Evaluate();
			Individual worseParent = parentList.get(parentList.size()-1);
			
			if(worseParent.getScore() < child.getScore())
			{
				parentList.set(parentList.size()-1, child);
				parentList.sort(Comparator.comparingDouble(Individual::getScore));
			}
		}
		return parentList;
	}
}
