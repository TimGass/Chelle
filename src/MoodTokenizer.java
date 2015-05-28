
public class MoodTokenizer extends Mood{
	    static int Happymatches = 0;
        static int Sadmatches = 0;
        static int Angrymatches = 0;
        static int Boredmatches = 0;
	public static void MoodTokenizer(String inputMood) {
		
		//cleaning up all the nasty characters we don't want
		inputMood = inputMood.replaceAll("[^A-Za-z ]", "");
        char delimiter =  ' ';
        
        //userInput tokenization
        // calculate number of delimiter characters
        int N = 0;
        for (int i = 0; i < inputMood.length(); i++)
            if (inputMood.charAt(i) == delimiter) N++;
        String[] tokens = new String[N+1];

        // parse N+1 tokens and store in an array
        int right = 0, left = 0;
        for (int i = 0; i < N; i++) {
            while(inputMood.charAt(right) != delimiter)
                right++;
            tokens[i] = inputMood.substring(left, right);
            right++;
            left = right;
        }
        tokens[N] = inputMood.substring(right, inputMood.length());
       
        // Happy tokenizer and word checker
        int O = 0;
        for (int i = 0; i < Happy.length(); i++)
            if (Happy.charAt(i) == delimiter) O++;
        String[] tokens2 = new String[O+1];

        
        int right2 = 0, left2 = 0;
        for (int i = 0; i < O; i++) {
            while(Happy.charAt(right2) != delimiter)
                right2++;
            tokens2[i] = Happy.substring(left2, right2);
            right2++;
            left2 = right2;
        }
        tokens2[O] = Happy.substring(right2, Happy.length());

        for (int i = 0; i < tokens.length; i++){
			for(int x = 0; x < tokens2.length; x++){
				int result = tokens[i].compareToIgnoreCase(tokens2[x]);
				if (result == 0) Happymatches++;
  		  
			}
		
  	  }

	
		//Sad tokenizer and word checker
		int P = 0;
		for (int i = 0; i < Sad.length(); i++)
        if (Sad.charAt(i) == delimiter) P++;
		String[] tokens3 = new String[P+1];

    
		int right3 = 0, left3 = 0;
		for (int i = 0; i < P; i++) {
			while(Sad.charAt(right3) != delimiter)
				right3++;
				tokens3[i] = Sad.substring(left3, right3);
				right3++;
				left3 = right3;
    }
		tokens3[P] = Sad.substring(right3, Sad.length());
    
    	for (int i = 0; i < tokens.length; i++){
    		for(int x = 0; x < tokens3.length; x++){
    			int result = tokens[i].compareToIgnoreCase(tokens3[x]);
    			if (result == 0) Sadmatches++;
		  
		}
	
	  }

    //Angry tokenizer and word checker
    	int Q = 0;
    	for (int i = 0; i < Angry.length(); i++)
    		if (Angry.charAt(i) == delimiter) Q++;
    	String[] tokens4 = new String[Q+1];

	    
	    int right4 = 0, left4 = 0;
	    for (int i = 0; i < Q; i++) {
	        while(Angry.charAt(right4) != delimiter)
	            right4++;
	        tokens4[i] = Angry.substring(left4, right4);
	        right4++;
	        left4 = right4;
	    }
	    tokens4[Q] = Angry.substring(right4, Angry.length());
	    
	    for (int i = 0; i < tokens.length; i++){
			for(int x = 0; x < tokens4.length; x++){
			  int result = tokens[i].compareToIgnoreCase(tokens4[x]);
			  if (result == 0) Angrymatches++;
			  
			}
		
		  }
	    
	    //Bored tokenizer and word checker
	    int R = 0;
	    for (int i = 0; i < Bored.length(); i++)
	        if (Bored.charAt(i) == delimiter) R++;
	    String[] tokens5 = new String[R+1];
	
	  
	    int right5 = 0, left5 = 0;
	    for (int i = 0; i < R; i++) {
	        while(Bored.charAt(right5) != delimiter)
	            right5++;
	        tokens5[i] = Bored.substring(left5, right5);
	        right5++;
	        left5 = right5;
	    }
	    tokens5[R] = Bored.substring(right5, Bored.length());
	    
	    for (int i = 0; i < tokens.length; i++){
			for(int x = 0; x < tokens5.length; x++){
			  int result = tokens[i].compareToIgnoreCase(tokens5[x]);
			  if (result == 0) Boredmatches++;
			  
			}
		
		  }
	    //For all the obnoxious people that use the negative to describe things :D
	    for (int i = 0; i < tokens.length; i++){
			  int result = tokens[i].compareToIgnoreCase(Exception);
			  if (result == 0) {
					  for(int x = 0; x < (tokens.length-i); x++){
				  for(int y = 0; y < tokens2.length; y++){
				  int result2 = tokens[x].compareToIgnoreCase(tokens2[y]);
				  if (result2 == 0){
					  Happymatches --;
					  Sadmatches ++;
					  
				  }
				  }
			  
				  for(int y = 0; y < tokens3.length; y++){
				  int result2 = tokens[x].compareToIgnoreCase(tokens3[y]);
				  if (result2 == 0){
					  Happymatches ++;
					  Sadmatches --;
					  
				  }
				  }
			  
				  for(int y = 0; y < tokens4.length; y++){
				  int result2 = tokens[x].compareToIgnoreCase(tokens4[y]);
				  if (result2 == 0){
					  Happymatches ++;
					  Angrymatches --;
					  
				  }
				  }
			 
		  for(int y = 0; y < tokens5.length; y++){
		  int result2 = tokens[x].compareToIgnoreCase(tokens5[y]);
		  if (result2 == 0){
			  Happymatches ++;
			  Boredmatches --;
			  
		  }
		  }
			  }

	    }
	    }
}	
	}	   


