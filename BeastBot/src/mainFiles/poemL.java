package mainFiles;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

public class poemL extends ListenerAdapter {
	


	private String[] array1;{
		array1 = new String[5];
		array1[0] = "Running poem 1:";
		array1[1] = "Roses are red,";
		array1[2] = "Violets are blue,"; 
		array1[3] = "Sugar is sweet,"; 
		array1[4] = "and so are you"; 
	}
	private String[] array2;{
		array2 = new String[5];
		array2[0] = "Place holder";
		array2[1] = "I need more arrays";
		array2[2] = "Please give me more";
		array2[3] = "Help me achive a goal of 20 poems";
		array2[4] = "Thanks";
	}
	private String[] array3;{
		array3 = new String[5];
		array3[0] = "Place holder";
		array3[1] = "I need more arrays";
		array3[2] = "Please give me more";
		array3[3] = "Help me achive a goal of 20 poems";
		array3[4] = "Thanks";
	}

	
	
		
	
	
	//String[][] arrays = {{"One 1","Two 1", "three 1"},
			//{"One 2", "Two 2", "Three 2"},
			//{"One 3", "Two 3", "Three 3"}};
	String [][] arrays = {array1, array2, array3};	
	
	public void onMessage(MessageEvent event) {
		
		GlobalVars vers = new GlobalVars();
		
		boolean prefix = event.getMessage().startsWith(vers.pref+"poem");
		boolean nBanned = vers.verrify(event.getUser().getRealName());
		
		if (prefix && !nBanned) {
			int poem = (int) Math.round(Math.random() * arrays.length);
			if (vers.debug) {
				event.respond(Integer.toString(poem));
			}
			
			//*for (int line = 0; line < arrays[poem][]; line++){
		
			//}
		}
		
		
	}
	
	
}
