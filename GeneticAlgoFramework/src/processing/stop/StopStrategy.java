package processing.stop;

public abstract class StopStrategy {
	
	/**
	 * Method to check if we continue the processing or we stop
	 * @return boolean, if true then we stop
	 */
	public abstract boolean Stop();
}
