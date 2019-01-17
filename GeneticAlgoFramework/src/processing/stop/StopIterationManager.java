package processing.stop;

import java.util.ArrayList;
import java.util.List;

public class StopIterationManager {

	private List<CriteriaStrategy> listStopCriteria;
	
	public StopIterationManager()
	{
		listStopCriteria = new ArrayList<CriteriaStrategy>();
	}
	
	public void AddCriteria(CriteriaStrategy criteria)
	{
		listStopCriteria.add(criteria);
	}
	
	public boolean StopBasedOnCriteria()
	{
		for(CriteriaStrategy criteria : listStopCriteria)
		{
			if(criteria.Stop() != true)
			{
				return false;
			}
		}
		
		return true;
	}
}
