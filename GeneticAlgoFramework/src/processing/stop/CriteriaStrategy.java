package processing.stop;

/**
 * Abstract class which implements the stopping method for a population
 * @author Alexandre Durandeau
 * @version 1.0
 * @see CriteriaIterationNumber, CriteriaNotEvolving, CriteriaSameBest, CriteriaTime
 */
public abstract class CriteriaStrategy {
	
	/**
	 * Method to check if we continue the processing or we stop
	 * @return boolean, if true then we stop
	 */
	public abstract boolean stop();
}