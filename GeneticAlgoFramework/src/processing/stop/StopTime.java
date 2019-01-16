package processing.stop;

public class StopTime extends StopStrategy {
	
	private int timeToReach;
	private long initTime;
	
	public StopTime(int timeToReach)
	{
		this.timeToReach = timeToReach;
		initTime = System.currentTimeMillis() / 1000;
	}
	
	/**
	 * Stop if we reach the desired time to wait
	 * @return boolean, if true then stop
	 */
	public boolean Stop()
	{
		if (System.currentTimeMillis() / 1000 - initTime < (long) timeToReach)
		{
			return false;
		}
		else
			return true;
	}
	
}