
public class ColorCompare extends ColorTokenizer{
	public static void ColorCompare(){
		int UserColorIdentifier = 0;
		boolean itWorks = false;
		ChelleColor ChelleColorObject = new ChelleColor();
		
		  if ((Yellowmatches > Orangematches)&&(Yellowmatches > Redmatches)&&(Yellowmatches > Pinkmatches)&&
			  (Yellowmatches > Purplematches)&&(Yellowmatches > Bluematches)&&(Yellowmatches > Greenmatches)&&
			  (Yellowmatches > Brownmatches)&&(Yellowmatches > Blackmatches)&&(Yellowmatches > Whitematches)&&
			  (Yellowmatches > Clearmatches))  {
	        	    UserColorIdentifier = 1;
	        	    itWorks = true;
	        } 
		  if ((Orangematches > Yellowmatches)&&(Orangematches > Redmatches)&&(Orangematches > Pinkmatches)&&
			  (Orangematches > Purplematches)&&(Orangematches > Bluematches)&&(Orangematches > Greenmatches)&&
			  (Orangematches > Brownmatches)&&(Orangematches > Blackmatches)&&(Orangematches > Whitematches)&&
			  (Orangematches > Clearmatches))  {
			  	    UserColorIdentifier = 2;
			        itWorks = true;
			        } 
		  if ((Redmatches > Orangematches)&&(Redmatches > Yellowmatches)&&(Redmatches > Pinkmatches)&&
			  (Redmatches > Purplematches)&&(Redmatches > Bluematches)&&(Redmatches > Greenmatches)&&
			  (Redmatches > Brownmatches)&&(Redmatches > Blackmatches)&&(Redmatches > Whitematches)&&
			  (Redmatches > Clearmatches))  {
			        UserColorIdentifier = 3;
			        itWorks = true;
			        } 
		  if ((Pinkmatches > Orangematches)&&(Pinkmatches > Redmatches)&&(Pinkmatches > Yellowmatches)&&
			  (Pinkmatches > Purplematches)&&(Pinkmatches > Bluematches)&&(Pinkmatches > Greenmatches)&&
			  (Pinkmatches > Brownmatches)&&(Pinkmatches > Blackmatches)&&(Pinkmatches > Whitematches)&&
			  (Pinkmatches > Clearmatches))  {
			        UserColorIdentifier = 4;
			        itWorks = true;
			        } 
		  if ((Purplematches > Orangematches)&&(Purplematches > Redmatches)&&(Purplematches > Pinkmatches)&&
			 (Purplematches > Yellowmatches)&&(Purplematches > Bluematches)&&(Purplematches > Greenmatches)&&
			 (Purplematches > Brownmatches)&&(Purplematches > Blackmatches)&&(Purplematches > Whitematches)&&
			 (Purplematches > Clearmatches))  {
			        UserColorIdentifier = 5;
			        itWorks = true;
			        } 
		  if ((Bluematches > Orangematches)&&(Bluematches > Redmatches)&&(Bluematches > Pinkmatches)&&
			  (Bluematches > Purplematches)&&(Bluematches > Yellowmatches)&&(Bluematches > Greenmatches)&&
			  (Bluematches > Brownmatches)&&(Bluematches > Blackmatches)&&(Bluematches > Whitematches)&&
			  (Bluematches > Clearmatches))  {
			        UserColorIdentifier = 6;
			        itWorks = true;
			        } 
		  if ((Greenmatches > Orangematches)&&(Greenmatches > Redmatches)&&(Greenmatches > Pinkmatches)&&
			  (Greenmatches > Purplematches)&&(Greenmatches > Bluematches)&&(Greenmatches > Yellowmatches)&&
			  (Greenmatches > Brownmatches)&&(Greenmatches > Blackmatches)&&(Greenmatches > Whitematches)&&
			  (Greenmatches > Clearmatches))  {
			        UserColorIdentifier = 7;
			        itWorks = true;
			        } 
		  if ((Brownmatches > Orangematches)&&(Brownmatches > Redmatches)&&(Brownmatches > Pinkmatches)&&
			  (Brownmatches > Purplematches)&&(Brownmatches > Bluematches)&&(Brownmatches > Greenmatches)&&
			  (Brownmatches > Yellowmatches)&&(Brownmatches > Blackmatches)&&(Brownmatches > Whitematches)&&
			  (Brownmatches > Clearmatches))  {
			        UserColorIdentifier = 8;
			        itWorks = true;
			        } 
		  if ((Blackmatches > Orangematches)&&(Blackmatches > Redmatches)&&(Blackmatches > Pinkmatches)&&
			  (Blackmatches > Purplematches)&&(Blackmatches > Bluematches)&&(Blackmatches > Greenmatches)&&
			  (Blackmatches > Brownmatches)&&(Blackmatches > Yellowmatches)&&(Blackmatches > Whitematches)&&
			  (Blackmatches > Clearmatches))  {
			        UserColorIdentifier = 9;
			        itWorks = true;
			        } 
		  if ((Whitematches > Orangematches)&&(Whitematches > Redmatches)&&(Whitematches > Pinkmatches)&&
			  (Whitematches > Purplematches)&&(Whitematches > Bluematches)&&(Whitematches > Greenmatches)&&
			  (Whitematches > Brownmatches)&&(Whitematches > Blackmatches)&&(Whitematches > Yellowmatches)&&
			  (Whitematches > Clearmatches))  {
			        UserColorIdentifier = 10;
			        itWorks = true;
			        } 
		  if ((Clearmatches > Orangematches)&&(Clearmatches > Redmatches)&&(Clearmatches > Pinkmatches)&&
			  (Clearmatches > Purplematches)&&(Clearmatches > Bluematches)&&(Clearmatches > Greenmatches)&&
			  (Clearmatches > Brownmatches)&&(Clearmatches > Blackmatches)&&(Clearmatches > Whitematches)&&
			  (Clearmatches > Yellowmatches))  {
			        UserColorIdentifier = 11;
			        itWorks = true;
			        } 
		  if(UserColorIdentifier == 0){
			  if (Yellowmatches > 0)  {
				  if ((Yellowmatches == Orangematches)||(Yellowmatches == Redmatches)||(Yellowmatches == Pinkmatches)||
					  (Yellowmatches == Purplematches)||(Yellowmatches == Bluematches)||(Yellowmatches == Greenmatches)||
				      (Yellowmatches == Brownmatches)||(Yellowmatches == Blackmatches)||(Yellowmatches == Whitematches)||
				      (Yellowmatches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  
		  if(UserColorIdentifier == 0){
			  if (Orangematches > 0)  {
				  if ((Orangematches == Yellowmatches)||(Orangematches == Redmatches)||(Orangematches == Pinkmatches)||
					  (Orangematches == Purplematches)||(Orangematches == Bluematches)||(Orangematches == Greenmatches)||
				      (Orangematches == Brownmatches)||(Orangematches == Blackmatches)||(Orangematches == Whitematches)||
				      (Orangematches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  if(UserColorIdentifier == 0){
			  if (Redmatches > 0)  {
				  if ((Redmatches == Orangematches)||(Redmatches == Yellowmatches)||(Redmatches == Pinkmatches)||
					  (Redmatches == Purplematches)||(Redmatches == Bluematches)||(Redmatches == Greenmatches)||
				      (Redmatches == Brownmatches)||(Redmatches == Blackmatches)||(Redmatches == Whitematches)||
				      (Redmatches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  if(UserColorIdentifier == 0){
			  if (Pinkmatches > 0)  {
				  if ((Pinkmatches == Orangematches)||(Pinkmatches == Redmatches)||(Pinkmatches == Yellowmatches)||
					  (Pinkmatches == Purplematches)||(Pinkmatches == Bluematches)||(Pinkmatches == Greenmatches)||
				      (Pinkmatches == Brownmatches)||(Pinkmatches == Blackmatches)||(Pinkmatches == Whitematches)||
				      (Pinkmatches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  if(UserColorIdentifier == 0){
			  if (Purplematches > 0)  {
				  if ((Purplematches == Orangematches)||(Purplematches == Redmatches)||(Purplematches == Pinkmatches)||
					  (Purplematches == Yellowmatches)||(Purplematches == Bluematches)||(Purplematches == Greenmatches)||
				      (Purplematches == Brownmatches)||(Purplematches == Blackmatches)||(Purplematches == Whitematches)||
				      (Purplematches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  if(UserColorIdentifier == 0){
			  if (Bluematches > 0)  {
				  if ((Bluematches == Orangematches)||(Bluematches == Redmatches)||(Bluematches == Pinkmatches)||
					  (Bluematches == Purplematches)||(Bluematches == Yellowmatches)||(Bluematches == Greenmatches)||
				      (Bluematches == Brownmatches)||(Bluematches == Blackmatches)||(Bluematches == Whitematches)||
				      (Bluematches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  
		  if(UserColorIdentifier == 0){
			  if (Greenmatches > 0)  {
				  if ((Greenmatches == Orangematches)||(Greenmatches == Redmatches)||(Greenmatches == Pinkmatches)||
					  (Greenmatches == Purplematches)||(Greenmatches == Bluematches)||(Greenmatches == Yellowmatches)||
				      (Greenmatches == Brownmatches)||(Greenmatches == Blackmatches)||(Greenmatches == Whitematches)||
				      (Greenmatches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  
		  if(UserColorIdentifier == 0){
			  if (Brownmatches > 0)  {
				  if ((Brownmatches == Orangematches)||(Brownmatches == Redmatches)||(Brownmatches == Pinkmatches)||
					  (Brownmatches == Purplematches)||(Brownmatches == Bluematches)||(Brownmatches == Greenmatches)||
				      (Brownmatches == Yellowmatches)||(Brownmatches == Blackmatches)||(Brownmatches == Whitematches)||
				      (Brownmatches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  
		  if(UserColorIdentifier == 0){
			  if (Blackmatches > 0)  {
				  if ((Blackmatches == Orangematches)||(Blackmatches == Redmatches)||(Blackmatches == Pinkmatches)||
					  (Blackmatches == Purplematches)||(Blackmatches == Bluematches)||(Blackmatches == Greenmatches)||
				      (Blackmatches == Brownmatches)||(Blackmatches == Yellowmatches)||(Blackmatches == Whitematches)||
				      (Blackmatches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  
		  if(UserColorIdentifier == 0){
			  if (Whitematches > 0)  {
				  if ((Whitematches == Orangematches)||(Whitematches == Redmatches)||(Whitematches == Pinkmatches)||
					  (Whitematches == Purplematches)||(Whitematches == Bluematches)||(Whitematches == Greenmatches)||
				      (Whitematches == Brownmatches)||(Whitematches == Blackmatches)||(Whitematches == Yellowmatches)||
				      (Whitematches == Clearmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  
		  if(UserColorIdentifier == 0){
			  if (Clearmatches > 0)  {
				  if ((Clearmatches == Orangematches)||(Clearmatches == Redmatches)||(Clearmatches == Pinkmatches)||
					  (Clearmatches == Purplematches)||(Clearmatches == Bluematches)||(Clearmatches == Greenmatches)||
				      (Clearmatches == Brownmatches)||(Clearmatches == Blackmatches)||(Clearmatches == Whitematches)||
				      (Clearmatches == Yellowmatches))  {
			       		UserColorIdentifier = 12;
			        	itWorks = true;
			        } 
			  }
		  }
		  
		  if (itWorks) ChelleColorObject.Chellecolor(UserColorIdentifier);
			  
		  else if(!itWorks)System.out.println("Sorry, I've never heard of that color...");
			  
		  
	}

}
