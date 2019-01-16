package configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConfigManager {

	
	public static final String REPLACE_RANDOM = "replace.random";
	public static final String REPLACE_BEST_CHILDREN = "replace.bestChildren";
	
	public static final String SELECTION_RANDOM = "selection.random";
	public static final String SELECTION_BEST_CHILDREN = "replace.bestChildren";
	
	public static final String STOP_TIMEOUT = "stop.time";
	public static final String STOP_ITERATIONS = "stop.interations";
	public static final String STOP_NOT_EVOLVING = "stop.notEvolving";
	public static final String STOP_BEST_SINCE_X_ITERATION = "stop.interations";
	
	
	private Long stopTimeout;
	private Long stopIterarions;
	private Long stopNotEvolving;
	private Long stopBestIteration;
	
	private String choosenReplace;
	private String choosenSelection;
	private HashMap<String, Long> choosenStopCondition;
	
	private boolean isReplaceConfigured = false;
	private boolean isSelectionConfigured = false;
	private boolean isStopConditionConfigured = false;
	
	public ConfigManager() {
		choosenStopCondition = new HashMap<String, Long>();
	}

	public void setReplaceStrategy(String replaceMethod) throws Exception {
		if(replaceMethod == "replace.random" || replaceMethod == "replace.bestChildren") {
					choosenReplace = replaceMethod;
		}
		else {
			throw new Exception("Replacement strategy is not recognised, use REPLACE_RANDOM or REPLACE_BEST_CHILDREN instead.");
		}
	}
	
	public void setSelectionStrategy(String selectionMethod) throws Exception {
		if(selectionMethod == "selection.random" || selectionMethod == "selection.bestChildren") {
					choosenReplace = selectionMethod;
		}
		else {
			throw new Exception("Selection strategy is not recognised, use SELECTION_RANDOM or SELECTION_BEST_CHILDREN instead.");
		}
	}
	
	public void AddStopCondition(String stopCondition, Long parameterStopCondition) {
		if(this.choosenStopCondition.size() > 0 ) {
			this.choosenStopCondition.put(stopCondition, parameterStopCondition);
			isStopConditionConfigured = true;
		}
		else {
			isStopConditionConfigured = false;
		}
	}
	
	private boolean isConfigurationDone() {
		return isStopConditionConfigured && isReplaceConfigured && isSelectionConfigured;
	}
	
	public Configuration getConfiguration() throws Exception {
		if(isConfigurationDone()) {
			return new Configuration(choosenSelection, choosenReplace, choosenStopCondition);
		}
		else {
			throw new Exception("Configuration has not been done properly. Selection Strategy, Replace Strategy of Stop Conditions is not defined");

		}
	}
	
	
	
}
