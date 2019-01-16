package processing.stop;

import java.util.Timer;

public class StopTime extends StopStrategy {

	private Timer timer = new Timer();
	private int timeToReach;
	
	public StopTime()
	{
		timer.equals(0);
	}
	
	public boolean Stop()
	{
		if (timer.equals(timeToReach))
			return true;
		else
			return false;
	}
	
}
