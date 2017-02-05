//Bobfried der Bot von Team Bobfried
//Info:
//https://www.youtube.com/watch?v=fy6-YZTa5-U
//http://home.dv8tion.net:8080/job/JDA/Promoted%20Build/javadoc/

//Impotiert einige notwendige Befehle
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class Bot {
	
	//JDA = API
	public static JDA jda;
	//Unveränderbarer String mit Bobfrieds ID
	public static final String BOT_TOKEN = "Mjc3NzQxOTMwMjAzMzE2MjI4.C3iWaQ.zaBDtudr0yjnd_Dh2BIGMX-3yp8";
	
	public static void main(String[] args) {
		//try-catch fängt Fehlermeldungen auf die von buildBlocking geworfen werden
		//addListener fügt einen EventListener hinzu
		//setToken definiert die ID des Bots
		try {
			jda = new JDABuilder(AccountType.BOT).addListener(new BotListener()).setToken(BOT_TOKEN).buildBlocking();
		} catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
			e.printStackTrace();
		}
	}

}
