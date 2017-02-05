import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class BotListener extends ListenerAdapter{
	
	Boolean spamprotection = false;
	 
	@Override 																//@Override �berschreibt die vorhergehende Methode onMessageReceived der API
	public void onMessageReceived(MessageReceivedEvent e){ 					//Feuert ein Event wenn eine Nachricht empfangen wird und speichert Informationen in e 
		//Funktionen werden in der Doc erl�utert
		if(e.getMessage().getRawContent().equalsIgnoreCase("spam") && spamprotection == false){
			e.getChannel().sendMessage("spam").queue();
		}
		if(e.getMessage().getRawContent().equalsIgnoreCase("�hh Bob")){
			spamprotection = true;
			e.getChannel().sendMessage("spam?").queue();
		}
		if(e.getMessage().getRawContent().startsWith("�")){
			e.getChannel().sendMessage("spam?").queue();
			e.getMessage().deleteMessage().queue();
		}
	}
	
}
