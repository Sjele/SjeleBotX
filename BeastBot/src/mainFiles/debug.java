package mainFiles;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

public class debug extends ListenerAdapter {
	
	GlobalVars vars = new GlobalVars(); 
	
	public void onMessage(MessageEvent event){
		
		boolean prefix = event.getMessage().startsWith(vars.pref);
	
		if (prefix && vars.debug) {
			
			String[] words = event.getMessage().split(" ");
			String cmd = words[0].replace("!%", "");
			String arguments = event.getMessage().replace("!%"+cmd+" ", "");
			
			if (event.getBot().getListenerManager().getListeners().toString().matches(".*"+cmd+"L.*")) {
				event.respond("The command "+cmd+" is triggerd with the args: "+arguments);
		
			}else{
				event.respond("The command "+cmd+" does not exsist!");
			}
		}
		
	}	

}
