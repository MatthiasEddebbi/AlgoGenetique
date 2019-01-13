package processing.replace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import main.Individual;

public class ReplaceRandom extends ReplaceStrategy{

	public List<Individual> Replace(List<Individual> parentList, List<Individual> childList){
		
		int i, rand;

		for (i=0; i<childList.size(); i++) {
			
			parentList.sort(Comparator.comparingDouble(Individual::getScore));
			rand = 1 + (int)(Math.random() * (parentList.size()));
			parentList.add(rand, childList.get(i));
		}
		
		return parentList;
	}
}
