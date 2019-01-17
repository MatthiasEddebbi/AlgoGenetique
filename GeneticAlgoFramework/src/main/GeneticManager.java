package main;

import java.util.List;

import processing.generation.*;
import processing.replace.*;
import processing.selection.*;
import processing.stop.*;

public class GeneticManager {
	
	private ReplaceStrategy replace;
	
	private SelectionStrategy selection;
	
	private GenerationChild generation;
	
	private StopIterationManager stopManager;
	
	private List<Individual> oldGeneration;
	
	private List<Individual> currentGeneration;
	
	private double mutationRate;
	
	private static GeneticManager instance = new GeneticManager();
	
	private GeneticManager() {
		
	}
	
	/**
	 * Method that will evaluate, cross and mutate the individuals to obtain "better" individuals
	 * @return List of individuals with parameters closer to a minimal
	 */
	public List<Individual> Processing() {
		int index = 0;
		do {
			
		List<Individual> parents = this.selection.Selection(currentGeneration,10);
		
		List<Individual> children = this.generation.GenerateChildList(parents);
		
		this.oldGeneration = parents;
		
		currentGeneration = this.replace.Replace(currentGeneration, children);
		
		index ++;
		
		}
		while(stopManager.StopBasedOnCriteria() != true);
		
		System.out.println(index);
		
		return currentGeneration;
	}
	
	// Getters and Setters
	
	public static GeneticManager getInstance() {
		return instance;
	}

	public List<Individual> getCurrentGeneration() {
		return currentGeneration;
	}

	public void setCurrentGeneration(List<Individual> currentGeneration) {
		this.currentGeneration = currentGeneration;
	}

	public void setMutationRate(double mutationRate) {
		this.mutationRate = mutationRate;
	}

	public void setReplace(ReplaceStrategy replace) {
		this.replace = replace;
	}

	public void setSelection(SelectionStrategy selection) {
		this.selection = selection;
	}

	public void setGeneration(GenerationChild generation) {
		this.generation = generation;
	}


	public void setStop(StopIterationManager stop) {
		this.stopManager = stop;
	}
	
}
