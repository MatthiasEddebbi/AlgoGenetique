package main;

import java.util.List;

import processing.generation.*;
import processing.replace.*;
import processing.selection.*;
import processing.stop.*;

public class SingletonGeneticManager {
	
	private ReplaceStrategy 		replace;
	
	private SelectionStrategy 		selection;
	
	private GenerationChild 		generation;
	
	private StopIterationManager 	stopManager;
	
	private List<Individual> 		currentGeneration;
	
	private static SingletonGeneticManager instance = new SingletonGeneticManager();
	
	private SingletonGeneticManager() {
		
	}
	
	/**
	 * Method that will evaluate, cross and mutate the individuals to obtain "better" individuals
	 * @return List of individuals with parameters closer to a minimal
	 */
	public List<Individual> processing() {
		
		int index = 0;
		
		if(checkIndividualListIsCorrect() && isConfigurationDone()) {

			preProcessing();
			
			do {
				
			List<Individual> parents = selection.selection(currentGeneration,10);
			
			List<Individual> children = generation.generateChildList(parents);
			
			this.currentGeneration = replace.replace(currentGeneration, children);
			
			index ++;
			
			} while(stopManager.stopBasedOnCriteria() != true);
			
			System.out.println(index);
		} 
		
		return currentGeneration;
	}
	
	public void preProcessing() {
		selection.setNumberOfChildren(currentGeneration.size());
	}
	
	private boolean isConfigurationDone() {
		return selection != null && replace != null && generation != null && stopManager != null;
	}

	
	// Getters and Setters
	
	public static SingletonGeneticManager getInstance() {
		return instance;
	}

	public List<Individual> getCurrentGeneration() {
		return currentGeneration;
	}

	public void setCurrentGeneration(List<Individual> currentGeneration) {
		this.currentGeneration = currentGeneration;
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
	
	private boolean checkIndividualListIsCorrect() {
		
		if(currentGeneration == null || currentGeneration.size() < 2) {
			System.out.println("The population is inexistant or the number of inidividuals is not enough.");
			return false;
		} else {
			return true;
		}
	}
}
