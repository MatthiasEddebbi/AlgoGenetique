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

	public StopIterationManager() {
		listStopCriteria = new ArrayList<CriteriaStrategy>();
	}

	public void addCriteria(CriteriaStrategy criteria) {
		listStopCriteria.add(criteria);
	}

	public boolean stopBasedOnCriteria() {
		for (CriteriaStrategy criteria : listStopCriteria) {
			if (criteria.stop() != true) {
				return false;
			}
		}
		return true;
	}
}
