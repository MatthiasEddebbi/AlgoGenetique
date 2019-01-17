package processing.stop;

public class CriteriaIterationNumber extends CriteriaStrategy{
	
	private int iterations;
	private int currentIterationCount;
	
	public CriteriaIterationNumber(int iterations)
	{
		this.iterations = iterations;
		this.currentIterationCount = 0;
	}

	/**
	 * Stop the processing if we reach the max number of iterations
	 * @return boolean, stop if true
	 */
	@Override
	public boolean Stop() {
		
		currentIterationCount ++;
		
		if (currentIterationCount < iterations)
			return false;
		else
			return true;
	}

}
