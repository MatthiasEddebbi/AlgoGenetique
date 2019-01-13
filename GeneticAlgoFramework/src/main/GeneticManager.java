package main;

import java.util.List;

import processing.generation.*;
import processing.replace.*;
import processing.selection.*;

public class GeneticManager {
	
	private ReplaceStrategy replace;
	
	private selectionStrategy selection;
	
	private List<Individual> oldGeneration;
	
	private List<Individual> currentGeneration;
	
	private double mutationRate;
	
	
	
	private static GeneticManager instance = new GeneticManager();
	
	private GeneticManager() {
		
	}
	
	public static GeneticManager getInstance() {
		return instance;
	}
	
}
