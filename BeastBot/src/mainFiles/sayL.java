package mainFiles;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

public class sayL extends ListenerAdapter {
	private GlobalVars vars = new GlobalVars();
	public void onMessage(MessageEvent event) {
		//check for vars
		boolean prefix = event.getMessage().startsWith(vars.pref+"say");
		//boolean nBanned = vars.banned.contains(event.getUser().getRealName());
		boolean nBanned = vars.verrify(event.getUser().getRealName());
		if (prefix && !nBanned) {
			//if (vars.debug) {
				//event.respond("Command say is triggerd with the arguments: "+ event.getMessage().substring(6)+". By user: "+event.getUser().getNick());
			//}
			event.respond(event.getMessage().substring(6));
			System.out.println(event.getUser().getNick()+" just issued say command with text: "+ event.getMessage().substring(6));
			
		}else if(prefix && nBanned) {
			event.respond(" You are banned from this bot");
			System.out.println(event.getUser().getNick()+" just tried to use say command and is banned!");
		}
		
		
	}
}
