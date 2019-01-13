package processing.replace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import main.Individual;

public class ReplaceBest extends ReplaceStrategy{

	public List<Individual> Replace(List<Individual> parentList, List<Individual> childList){
		
		parentList.sort(Comparator.comparingDouble(Individual::getScore).reversed());
		
		for (Individual child : childList) 
		{
			child.Evaluate();
			Individual worseParent = parentList.get(parentList.size()-1);
			
			if(worseParent.getScore() < child.getScore())
			{
				parentList.set(parentList.size()-1, child);
				parentList.sort(Comparator.comparingDouble(Individual::getScore).reversed());
			}
		}
		return parentList;
	}
}
