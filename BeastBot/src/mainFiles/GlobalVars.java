package mainFiles;

import java.util.ArrayList;
import java.util.List;

public class GlobalVars {
    //Prefix
    public  String pref = "!%";
    public  List<String> admins = new ArrayList<String>();
    public  List<String> banned = new ArrayList<String>();
    public 	boolean debug = true;
   
    public GlobalVars(){ //This is the constructor, constructors always have the same name as class
            admins.add("Sjele");
            banned.add("LuaIRC");
            //banned.add("Sorroko");
    }
    
    
    public boolean verrify(String name) {
    	
    	if (banned.contains(name)) {
    		return true;
    	}else{
    		return false;
    	}	
    
    }




}
