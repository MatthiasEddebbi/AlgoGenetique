package main;

import java.util.ArrayList;
import java.util.List;

import processing.replace.*;
import processing.selection.*;
import processing.generation.*;

public class Main {

	public static void main(String[] args) {
		
		double mutationRate = 5;
		
		List<Individual> firstGeneration = new ArrayList<Individual>();
		
		for(int i = 0; i < 15; i++)
		{
			firstGeneration.add(new IndividualTest(i));
		}
		
		GeneticManager manager = GeneticManager.getInstance();
		
		SelectionRandom selection = new SelectionRandom();
		manager.getInstance().setSelection(selection);
		
		GenerationChild generation = new GenerationChild(mutationRate,10);
		manager.getInstance().setGeneration(generation);
		
		ReplaceBest replace = new ReplaceBest();
		manager.getInstance().setReplace(replace);
		
		manager.setCurrentGeneration(firstGeneration);
		
		List<Individual> results = manager.getInstance().Processing();
		
		for (Individual ind : results)
		{
			System.out.println(((IndividualTest)ind).toString());
		}
		
		System.out.println("Taille de la liste :" + results.size());
	}
}
