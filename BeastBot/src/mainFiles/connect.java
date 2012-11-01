package mainFiles;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.ConnectEvent;

public class connect extends ListenerAdapter{
	
	GlobalVars vers = new GlobalVars();
	
	public void onConnect(ConnectEvent event) {
		if (vers.debug) {
			event.respond("This bot is in Debug mode");
		}
	}

}
