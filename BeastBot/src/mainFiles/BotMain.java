package mainFiles;
import org.pircbotx.PircBotX;

import org.pircbotx.hooks.Event;
import org.pircbotx.hooks.Listener;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;
import org.pircbotx.hooks.managers.ListenerManager;



public class BotMain extends ListenerAdapter implements Listener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        //Create a new bot
		PircBotX bot = new PircBotX();

        //Setup this bot
        bot.setName("SjBotX"); 
        bot.setLogin("SjBot");
        bot.setVerbose(true); 
        bot.setAutoNickChange(true); //false when i get gui working
        
        //Add commands
        bot.getListenerManager().addListener(new dateL());
        bot.getListenerManager().addListener(new sayL());
        bot.getListenerManager().addListener(new connect());
        bot.getListenerManager().addListener(new debug());
        //bot.getListenerManager().addListener(new helpL());
        //bot.getListenerManager().addListener(new helpL());
       // bot.getListenerManager().addListener(new poemL());
        
        //bot.connect throws various exceptions for failures
        try {
                bot.connect("irc.esper.net");
                bot.joinChannel("#ccbots");
        } 
        catch (Exception ex) {
                ex.printStackTrace();
        }

	}
	
}	
