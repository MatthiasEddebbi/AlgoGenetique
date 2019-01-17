package processing.stop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandre Durandeau
 * @version 1.0
 * @see CriteriaStrategy
 */
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
