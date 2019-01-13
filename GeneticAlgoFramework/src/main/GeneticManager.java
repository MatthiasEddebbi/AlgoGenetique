package main;

import java.util.List;

import processing.generation.*;
import processing.replace.*;
import processing.selection.*;

public class GeneticManager {
	
	private ReplaceStrategy replace;
	
	private SelectionStrategy selection;
	
	private List<Individual> oldGeneration;
	
	private List<Individual> currentGeneration;
	
	private double mutationRate;
	
	private static GeneticManager instance = new GeneticManager();
	
	private GeneticManager() {
		
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
}
