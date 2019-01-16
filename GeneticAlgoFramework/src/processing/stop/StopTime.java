package processing.stop;

import java.util.Timer;

public class StopTime extends StopStrategy {
	
	private int timeToReach;
	private long initTime;
	
	public StopTime(int timeToReach)
	{
		this.timeToReach = timeToReach;
		initTime = System.currentTimeMillis() * 1000;
	}
	
	public boolean Stop()
	{
		if (System.currentTimeMillis() * 1000 - initTime < (double) timeToReach)
			return false;
		else
			return true;
	}
	
}