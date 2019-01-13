package main;

/**
 * 
 * @author matth
 * Manager of genetic algorithme. Centralize every step of the processing
 */
public class GeneticManager {
	
	private static GeneticManager instance = new GeneticManager();
	
	private GeneticManager() {
		
	}
	
	public static GeneticManager getInstance() {
		return instance;
	}
	
	
    
}
