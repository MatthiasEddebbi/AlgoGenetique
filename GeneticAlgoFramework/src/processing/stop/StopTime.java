package processing.stop;

import java.util.Timer;

public class StopTime extends StopStrategy {

	private Thread thread = new Thread();
	private int timeToReach;
	
	public StopTime(int timeToReach)
	{
		this.timeToReach = timeToReach;
	}
	
	public boolean Stop()
	{
		for (int i=0 ; i < timeToReach ; i++)
		{
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		return true;
	}
	
}