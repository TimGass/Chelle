import java.util.Arrays;
public class RegionMatchesDemo {
	    public static void main(String[] args) {
	        String[] searchMe = {"Green", "Eggs", "and", "Ham"};
	        String findMe = "Eggs";
	        int searchMeLength = Arrays.toString(searchMe).length();
	        int findMeLength = findMe.length();
	        boolean foundIt = false;
	        for (int i = 0; 
	             i <= (searchMeLength - findMeLength);
	             i++) {
	           if (Arrays.toString(searchMe).regionMatches(i, findMe, 0, findMeLength)) {
	              foundIt = true;
	              System.out.println(i);
	              System.out.println(Arrays.toString(searchMe).substring(i, i + findMeLength));
	             break;
	           }
	           
	        }
	        if (!foundIt)
	            System.out.println("No match found.");
	    }
	}
