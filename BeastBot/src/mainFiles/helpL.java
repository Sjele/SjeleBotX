package mainFiles;

import java.util.Set;

import org.pircbotx.hooks.Listener;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

public class helpL extends ListenerAdapter {
	
	public void onMessage(MessageEvent event) {
		
		GlobalVars vars = new GlobalVars();
		
		boolean prefix = event.getMessage().startsWith(vars.pref+"help");
		if (prefix){
		String rawcmds = event.getBot().getListenerManager().getListeners().toString();
		String[] cmds = rawcmds.split("\\.(.+)L@", 30);
		String s = "";
		//command = rawcmds.match("\\.(.+)L@/");
		
		for (int i = 0; i< cmds.length; i++){
			s = s+" "+ cmds[i];
		}
		
		event.respond("The commands i know are: "+ s);
		event.respond("Note to Sjele Remove L's :P");
		}
	}

}
