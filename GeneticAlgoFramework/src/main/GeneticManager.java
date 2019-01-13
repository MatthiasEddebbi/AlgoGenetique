package main;

import java.util.List;

import processing.generation.*;
import processing.replace.*;
import processing.selection.*;

public class GeneticManager {
	
	private ReplaceStrategy replace;
	
	private SelectionStrategy selection;
	
	private List<Individual> oldGeneration;
	
	private GenerationChild generation;
	
	private List<Individual> currentGeneration;
	
	private double mutationRate;
	
	private static GeneticManager instance = new GeneticManager();
	
	private GeneticManager() {
		
	}
	
	public List<Individual> Processing()
	{
		int index = 0;
		
		do {
			
		List<Individual> parents = this.selection.Selection(currentGeneration,10);
		
		List<Individual> children = this.generation.GenerateChildList(parents);
		
		this.oldGeneration = parents;
		
		currentGeneration = this.replace.Replace(currentGeneration, children);
		
		index +=1;
		
		}
		while(index < 0);
		
		return currentGeneration;
	}
	
	// getters and setters
	
	public static GeneticManager getInstance() {
		return instance;
	}

	public List<Individual> getCurrentGeneration() {
		return currentGeneration;
	}

	public void setCurrentGeneration(List<Individual> currentGeneration) {
		this.currentGeneration = currentGeneration;
	}

	public double getMutationRate() {
		return mutationRate;
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
	
}
