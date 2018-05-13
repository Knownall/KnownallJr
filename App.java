package discordBot.KnownallJr;

import java.util.Calendar;

//if error appears, check POM file and make sure update number is correct.

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class App extends ListenerAdapter {
    
	public static void main (String[] args) throws Exception {
        
		JDA jda = new JDABuilder(AccountType.BOT).setToken("NDQ0ODg4MTY4MjkxMTA2ODE3.DdieIg.TyFFqLhbN_mpC0Pr8Gxo73mohBA").buildBlocking();
        jda.addEventListener(new App());
        jda.setAutoReconnect(true);
    
	}
    

	@Override
    public void onMessageReceived(MessageReceivedEvent evt) {
    	
    	//Objects
    	
    	User user = evt.getAuthor();
    	MessageChannel channel = evt.getChannel();
    	Message message = evt.getMessage();
    	
    	//Methods
    	
    	if (("-Ahem.").equalsIgnoreCase(message.getContentRaw())) {
    		String phaseOfDay = "";
    		if (Calendar.HOUR_OF_DAY >= 0 && Calendar.HOUR_OF_DAY < 12) { //dead code depends on the time of the day
    			phaseOfDay = "Morning";
    		}
    		else if (Calendar.HOUR_OF_DAY >= 12 && Calendar.HOUR_OF_DAY < 17) {
    			phaseOfDay = "Afternoon";
    		}
    		else if (Calendar.HOUR_OF_DAY >= 17 && Calendar.HOUR_OF_DAY < 22) {
    			phaseOfDay = "Evening";
    		}
    		else {
    			phaseOfDay = "Night";
    		}
    		
    		String newMessage = "Good " + phaseOfDay + " " + user.getAsMention();
    		
    		channel.sendMessage(newMessage).queue();
    	}
    	
    	if (("-bork").equalsIgnoreCase(message.getContentRaw())) {
    		channel.sendMessage("I'm getting the bork repellant.").queue();;
    	}
    	
    	if (("-gay").equalsIgnoreCase(message.getContentRaw())) {
    		channel.sendMessage("So this is how " + user.getAsMention() + " comes out of the closet.").queue();;
    	}
    	
    	if (("-Lustfull").equalsIgnoreCase(message.getContentRaw())) {
    		channel.sendMessage("Lustfull will never be a good player.").queue();
    		channel.sendMessage("It will be a great player.").queue();
    	}
    	
    	if (("-Miroam").equalsIgnoreCase(message.getContentRaw())) {
    		channel.sendMessage("Stop playing fortnite and start playing some siege. :D").queue();
    	}
    }
}
