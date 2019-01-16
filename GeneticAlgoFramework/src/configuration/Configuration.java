package configuration;

import java.util.HashMap;

public class Configuration {
	
	private String selection;
	private String replace;
	private HashMap<String, Long> stopConditions;
	
	public Configuration(String selection, String replace, HashMap<String, Long> stopConditions) {
		super();
		this.selection = selection;
		this.replace = replace;
		this.stopConditions = stopConditions;
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
