package processing.stop;

import java.util.ArrayList;
import java.util.List;

public class StopManager {

	private List<StopStrategy> listStopCriteria;
	
	public StopManager()
	{
		listStopCriteria = new ArrayList<StopStrategy>();
	}
	
	public void AddCriteria(StopStrategy criteria)
	{
		listStopCriteria.add(criteria);
	}
	
	public boolean StopBasedOnCriteria()
	{
		for(StopStrategy criteria : listStopCriteria)
		{
			if(criteria.Stop() != true)
			{
				return false;
			}
		}
		
		return true;
	}
}
