package mainFiles;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;


public class dateL extends ListenerAdapter{
	
	private GlobalVars vars = new GlobalVars(); //making globals
	
	public void onMessage(MessageEvent event) {
		boolean prefix = event.getMessage().startsWith(vars.pref+"time");
		boolean nBanned = vars.verrify(event.getUser().getRealName());
		if (prefix && !nBanned) {
			event.respond("The time is " + new Date());
			System.out.println(event.getUser().getNick()+" just used the command time");
		}else if (prefix && nBanned) {
			event.respond("You are banned from the bot");
			System.out.println(event.getUser().getNick()+" just tried to use the command time!");
		}
	}	

}
