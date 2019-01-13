package main;

import java.util.ArrayList;
import java.util.List;

import processing.replace.*;
import processing.selection.*;

public class Main {

	public static void main(String[] args) {
		
		List<Individual> firstGeneration = new ArrayList<Individual>();
		
		for(int i = 0; i < 15; i++)
		{
			firstGeneration.add(new IndividualTest(i));
		}
		
		
		selectionBestIndividuals selection = new selectionBestIndividuals();
		
		ReplaceBest replace = new ReplaceBest();
		
		GeneticManager manager = GeneticManager.getInstance();
		
		manager.getInstance().setReplace(replace);
		
		manager.getInstance().setSelection(selection);
		
		
		manager.setCurrentGeneration(firstGeneration);
		
		
		
	}
}
