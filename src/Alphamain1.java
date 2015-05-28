import java.util.Scanner;
public class Alphamain1 {
	public static void main(String args[])throws InterruptedException {
		Scanner input = new Scanner(System.in);
		MoodTokenizer inputMoodObject = new MoodTokenizer();
		MoodCompare MoodCompareObject = new MoodCompare();
		ColorTokenizer userColorObject = new ColorTokenizer();
		ColorCompare ColorCompareObject = new ColorCompare();
		System.out.println("Hello! My name is Chelle. What is your name?");
		String name = input.nextLine();
		System.out.println("Nice to meet you " + name + "!");
		Thread.sleep(1800);
		System.out.println("How are you feeling today?");
		String inputMood = input.nextLine();
		inputMoodObject.MoodTokenizer(inputMood);
		MoodCompareObject.MoodCompare();
		Thread.sleep(3000);
		System.out.println("So, what is your favorite color?");
		String userColor = input.nextLine();
		userColorObject.ColorTokenizer(userColor);
		ColorCompareObject.ColorCompare();
		Thread.sleep(5000);
		System.out.println("Well, this is the end! I'll see you next time with" +
						  " a completely different personality! Goodbye!");
		
	}

}
