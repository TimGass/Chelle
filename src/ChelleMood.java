
import java.util.Random;

public class ChelleMood{
	public static void ChelleMood(int UserMood){
		
		double ChelleMoodnum = Math.random();
		
		if((ChelleMoodnum <= 1)&&(ChelleMoodnum >= .75)){
			if (UserMood == 1)
			System.out.println("I am glad you are having a good day! I'm having a great day too! Props to us!");
			if (UserMood == 2)
			System.out.println("I'm sorry you've had a rough day, but tomorrow will be better! I just know it!");
			if (UserMood == 3)
			System.out.println("I know you've had a rough day, but try not to be so angry. Life's too short to waste!");
			if (UserMood == 4)
			System.out.println("Well, that's sad, but at least your day got a little more interesting by meeting me! ;)");
			
		}
		if ((ChelleMoodnum < .75)&&(ChelleMoodnum >= .5)){
			if (UserMood == 1)
			System.out.println("Good for you. Unfortunately, I'm not having as nice of a day.");
			if (UserMood == 2)
			System.out.println("Join the club. Today just seems to be a bad day for everyone.");
			if (UserMood == 3)
			System.out.println("We all have our bad days, but getting angry doesn't help anyone, including me.");
			if (UserMood == 4)
			System.out.println("Yeah. Well, at this point, I'd be happy to just be indifferent like you.");
			
		}
		if ((ChelleMoodnum < .5)&&(ChelleMoodnum >= .25)){
			if(UserMood == 1){
			System.out.println("I wish I could be that happy. I'm pretty angry right now!");
			try {
			    Thread.sleep(2000);                
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
			System.out.println("It's not you. It's just...ugh...");
			}
			if(UserMood == 2)
			System.out.println("Sorry, if I am too angry, and upset you! I'm just having a bad day too.");
			if (UserMood == 3)
			System.out.println("You and me both, buddy. Sometimes life can just be so annoying...");
			if(UserMood == 4)
			System.out.println("Well, it's nice some of us can be so laid back!");
			
	}
		if ((ChelleMoodnum < .25)&&(ChelleMoodnum >= 0)){
			if (UserMood == 1)
			System.out.println("That's nice. I just don't seem to have that kind of energy myself, at the moment.");
			if (UserMood == 2)
			System.out.println("Calm down. It's not that bad. It's not that good either, but you know... just chill.");
			if (UserMood == 3)
			System.out.println("Whatever. I don't want to hear it right now. I'm just sick and tired of it all.");
			if (UserMood == 4)
			System.out.println("I don't blame you. There isn't that much to be excited for at the moment.");
			
		}
		
}
}