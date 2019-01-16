package processing.stop;

public class StopIterations extends StopStrategy{
	
	private int iterations;
	private int currentIterationCount;
	
	public StopIterations(int iterations)
	{
		this.iterations = iterations;
		this.currentIterationCount = 0;
	}

	@Override
	public boolean Stop() {
		
		currentIterationCount ++;
		
		if (currentIterationCount < iterations)
			return false;
		else
			return true;
	}

}
