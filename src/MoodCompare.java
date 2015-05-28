public class MoodCompare extends MoodTokenizer{
	public static void MoodCompare() {
	        ChelleMood ChelleMoodObject = new ChelleMood();
	        int UserMood = 0;
	        boolean itWorks = false;
	        if (Happymatches > 0){
		        if ((Happymatches >= Sadmatches)&&(Happymatches >= Angrymatches)&&(Happymatches >= Boredmatches)){
				UserMood = 1;
				itWorks = true;
		        }
	        }
	        if ((Sadmatches > Happymatches)&&(Sadmatches > Angrymatches)&&(Sadmatches > Boredmatches)){
	        	UserMood = 2;
	        	itWorks = true;
	        }
	        
			if ((Angrymatches > Happymatches)&&(Angrymatches > Sadmatches)&&(Angrymatches > Boredmatches)){
				UserMood = 3;
				itWorks = true;
			}
			if ((Boredmatches > Happymatches)&&(Boredmatches > Sadmatches)&&(Boredmatches > Angrymatches)){
				UserMood = 4;
				itWorks = true;
			}
			
		    
	     	  
	        if(itWorks){
	        	ChelleMoodObject.ChelleMood(UserMood);
	        }
	        else if (!itWorks)  System.out.println("I'm sorry. I am not sure what to say to that.");
	     }
	}

