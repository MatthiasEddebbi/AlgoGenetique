package processing.stop;

import java.util.Timer;

public class StopTime extends StopStrategy {

	private Timer timer = new Timer();
	private int timeToReach;
	
	public StopTime(int timeToReach)
	{
		timer.equals(0);
	}
	
	public boolean Stop()
	{
		if (timer.equals(timeToReach * 1000))
			return true;
		else
			return false;
	}
	
}
