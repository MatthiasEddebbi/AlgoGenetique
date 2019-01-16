package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import processing.replace.*;
import processing.selection.*;
import processing.generation.*;
import processing.stop.*;

public class Main {

	public static void main(String[] args) {
		
		double mutationRate = 5;
		
		List<Individual> firstGeneration = new ArrayList<Individual>();
		
		for(int i = 0; i < 100000; i++)
		{
			Random rand = new Random();
			double pickedNumber = rand.nextDouble() *10000 - 5000;
			firstGeneration.add(new IndividualTest(pickedNumber));
		}
		
		GeneticManager manager = GeneticManager.getInstance();
		
		manager.setCurrentGeneration(firstGeneration);
		
		SelectionBestIndividuals selection = new SelectionBestIndividuals();
		manager.getInstance().setSelection(selection);
		
		GenerationChild generation = new GenerationChild(mutationRate,500);
		manager.getInstance().setGeneration(generation);
		
		ReplaceBest replace = new ReplaceBest();
		manager.getInstance().setReplace(replace);
		
		StopTime stop = new StopTime(1);
		StopIterations stop1 = new StopIterations(5000);
		
		StopManager stopManager = new StopManager();
		stopManager.AddCriteria(stop);
		stopManager.AddCriteria(stop1);
		
		
		manager.setStop(stopManager);
		
		List<Individual> results = manager.getInstance().Processing();
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(((IndividualTest)results.get(i)).toString());
		}
		
		System.out.println("Taille de la liste :" + results.size());
	}
}
