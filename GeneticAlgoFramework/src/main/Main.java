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
		
		GeneticManager manager = GeneticManager.getInstance();
		
		SelectionBestIndividuals selection = new SelectionBestIndividuals();
		
		ReplaceBest replace = new ReplaceBest();
		
		manager.setCurrentGeneration(firstGeneration);
		
		
		
	}
}
