package configuration;

import java.util.HashMap;

/**
 * Class configuration avoiding having everything in GeneticManager
 * @author matth
 * @version 0.1
 * @throws Exception
 */
public class Configuration {
	
	private String selection;
	private String replace;
	private HashMap<String, Long> stopConditions;
	
	public Configuration(String selection, String replace, HashMap<String, Long> stopConditions) throws Exception {
		/*
		super();
		this.selection = selection;
		this.replace = replace;
		this.stopConditions = stopConditions;
		*/
		throw new Exception("Class not implemented yet");
	}

	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

	public String getReplace() {
		return replace;
	}

	public void setReplace(String replace) {
		this.replace = replace;
	}

	public HashMap<String, Long> getStopConditions() {
		return stopConditions;
	}

	public void setStopConditions(HashMap<String, Long> stopConditions) {
		this.stopConditions = stopConditions;
	}
	
	
}
