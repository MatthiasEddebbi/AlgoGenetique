package processing.replace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import main.Individual;

public class ReplaceBest extends ReplaceStrategy{

	public List<Individual> Replace(List<Individual> parentList, List<Individual> childList){
		List<Individual> newList = new ArrayList<Individual>();
		int i;
		
		for (i=0; i<parentList.size(); i++)
		{
			newList.add(parentList.get(i));
		}
		
		for (i=0; i<childList.size(); i++)
		{
			newList.add(childList.get(i));
		}
		for (i=0; i<newList.size(); i++)
		{
			newList.get(i).Evaluate();
		}
		
		newList.sort(Comparator.comparingDouble(Individual::getScore).reversed());
		
		for (i=0; i<parentList.size(); i++) 
		{
			parentList.add(i, newList.get(i));
		}
		
		return parentList;
	}
	
	
}
