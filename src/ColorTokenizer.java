
public class ColorTokenizer extends Color{
		static int Yellowmatches = 0;
		static int Orangematches = 0;
		static int Redmatches = 0;
		static int Pinkmatches = 0;
		static int Purplematches = 0;
		static int Bluematches = 0;
		static int Greenmatches = 0;
		static int Brownmatches = 0;
		static int Blackmatches = 0;
		static int Whitematches = 0;
		static int Clearmatches = 0;
		
		public static void ColorTokenizer(String userColor) {
			
			//cleaning up all the nasty characters we don't want
			userColor = userColor.replaceAll("[^A-Za-z -]", "");
			char delimiter =  ' ';
			
			//userColor tokenization
	        // calculate number of delimiter characters
	        int N = 0;
	        for (int i = 0; i < userColor.length(); i++)
	            if (userColor.charAt(i) == delimiter) N++;
	        String[] tokens = new String[N+1];

	        // parse N+1 tokens and store in an array
	        int right = 0, left = 0;
	        for (int i = 0; i < N; i++) {
	            while(userColor.charAt(right) != delimiter)
	                right++;
	            tokens[i] = userColor.substring(left, right);
	            right++;
	            left = right;
	        }
	        tokens[N] = userColor.substring(right, userColor.length());
	        
	        //Yellow tokenizer and word checker
	        int O = 0;
	        for (int i = 0; i < Yellow.length(); i++)
	            if (Yellow.charAt(i) == delimiter) O++;
	        String[] tokens2 = new String[O+1];

	        
	        int right2 = 0, left2 = 0;
	        for (int i = 0; i < O; i++) {
	            while(Yellow.charAt(right2) != delimiter)
	                right2++;
	            tokens2[i] = Yellow.substring(left2, right2);
	            right2++;
	            left2 = right2;
	        }
	        tokens2[O] = Yellow.substring(right2, Yellow.length());

	        for (int i = 0; i < tokens.length; i++){
				for(int x = 0; x < tokens2.length; x++){
					int result = tokens[i].compareToIgnoreCase(tokens2[x]);
					if (result == 0) Yellowmatches++;
	  		  
				}
			
	  	  }

			//Orange tokenizer and word checker 
			int P = 0;
			for (int i = 0; i < Orange.length(); i++)
	        if (Orange.charAt(i) == delimiter) P++;
			String[] tokens3 = new String[P+1];

	    
			int right3 = 0, left3 = 0;
			for (int i = 0; i < P; i++) {
				while(Orange.charAt(right3) != delimiter)
					right3++;
					tokens3[i] = Orange.substring(left3, right3);
					right3++;
					left3 = right3;
	    }
			tokens3[P] = Orange.substring(right3, Orange.length());
	    
	    	for (int i = 0; i < tokens.length; i++){
	    		for(int x = 0; x < tokens3.length; x++){
	    			int result = tokens[i].compareToIgnoreCase(tokens3[x]);
	    			if (result == 0) Orangematches++;
			  
			}
		
		  }
	    	 // Red tokenizer and word checker
	    	int Q = 0;
	    	for (int i = 0; i < Red.length(); i++)
	    		if (Red.charAt(i) == delimiter) Q++;
	    	String[] tokens4 = new String[Q+1];

		    
		    int right4 = 0, left4 = 0;
		    for (int i = 0; i < Q; i++) {
		        while(Red.charAt(right4) != delimiter)
		            right4++;
		        tokens4[i] = Red.substring(left4, right4);
		        right4++;
		        left4 = right4;
		    }
		    tokens4[Q] = Red.substring(right4, Red.length());
		    
		    for (int i = 0; i < tokens.length; i++){
				for(int x = 0; x < tokens4.length; x++){
				  int result = tokens[i].compareToIgnoreCase(tokens4[x]);
				  if (result == 0)Redmatches++;
				  
				}
			
			  }
		  
		    //Pink tokenizer and word checker
		    int R = 0;
		    for (int i = 0; i < Pink.length(); i++)
		        if (Pink.charAt(i) == delimiter) R++;
		    String[] tokens5 = new String[R+1];
		
		  
		    int right5 = 0, left5 = 0;
		    for (int i = 0; i < R; i++) {
		        while(Pink.charAt(right5) != delimiter)
		            right5++;
		        tokens5[i] = Pink.substring(left5, right5);
		        right5++;
		        left5 = right5;
		    }
		    tokens5[R] = Pink.substring(right5, Pink.length());
		    
		    for (int i = 0; i < tokens.length; i++){
				for(int x = 0; x < tokens5.length; x++){
				  int result = tokens[i].compareToIgnoreCase(tokens5[x]);
				  if (result == 0) Pinkmatches++;
				  
				}
		}
		    //Purple tokenizer and word checker
		    int S = 0;
		    for (int i = 0; i < Purple.length(); i++)
		        if (Purple.charAt(i) == delimiter) S++;
		    String[] tokens6 = new String[S+1];
		
		  
		    int right6 = 0, left6 = 0;
		    for (int i = 0; i < S; i++) {
		        while(Purple.charAt(right6) != delimiter)
		            right6++;
		        tokens6[i] = Purple.substring(left6, right6);
		        right6++;
		        left6 = right6;
		    }
		    tokens6[S] = Purple.substring(right6, Purple.length());
		    
		    for (int i = 0; i < tokens.length; i++){
				for(int x = 0; x < tokens6.length; x++){
				  int result = tokens[i].compareToIgnoreCase(tokens6[x]);
				  if (result == 0) Purplematches++;
				  
				}
		    	}
		    //Blue tokenizer and word checker
		    int T = 0;
		    for (int i = 0; i < Blue.length(); i++)
		        if (Blue.charAt(i) == delimiter) T++;
		    String[] tokens7 = new String[T+1];
		
		  
		    int right7 = 0, left7 = 0;
		    for (int i = 0; i < T; i++) {
		        while(Blue.charAt(right7) != delimiter)
		            right7++;
		        tokens7[i] = Blue.substring(left7, right7);
		        right7++;
		        left7 = right7;
		    }
		    tokens7[T] = Blue.substring(right7, Blue.length());
		    
		    for (int i = 0; i < tokens.length; i++){
				for(int x = 0; x < tokens7.length; x++){
				  int result = tokens[i].compareToIgnoreCase(tokens7[x]);
				  if (result == 0) Bluematches++;
				  
				}
			  }
		    //Green tokenizer and word checker
		    int U = 0;
		    for (int i = 0; i < Green.length(); i++)
		        if (Green.charAt(i) == delimiter) U++;
		    String[] tokens8 = new String[U+1];
		
		  
		    int right8 = 0, left8 = 0;
		    for (int i = 0; i < U; i++) {
		        while(Green.charAt(right8) != delimiter)
		            right8++;
		        tokens8[i] = Green.substring(left8, right8);
		        right8++;
		        left8 = right8;
		    }
		    tokens8[U] = Green.substring(right8, Green.length());
		    
		    for (int i = 0; i < tokens.length; i++){
				for(int x = 0; x < tokens8.length; x++){
				  int result = tokens[i].compareToIgnoreCase(tokens8[x]);
				  if (result == 0) Greenmatches++;
				  
				}
			
			  }
		    //Brown tokenizer and word checker
		    int V = 0;
		    for (int i = 0; i < Brown.length(); i++)
		        if (Brown.charAt(i) == delimiter) V++;
		    String[] tokens9 = new String[V+1];
		
		  
		    int right9 = 0, left9 = 0;
		    for (int i = 0; i < V; i++) {
		        while(Brown.charAt(right9) != delimiter)
		            right9++;
		        tokens9[i] = Brown.substring(left9, right9);
		        right9++;
		        left9 = right9;
		    }
		    tokens9[V] = Brown.substring(right9, Brown.length());
		    
		    for (int i = 0; i < tokens.length; i++){
				for(int x = 0; x < tokens9.length; x++){
				  int result = tokens[i].compareToIgnoreCase(tokens9[x]);
				  if (result == 0) Brownmatches++;
				}
		    }
				 
			//Black tokenizer and word checker
			int W = 0;
			for (int i = 0; i < Black.length(); i++)
				 if (Black.charAt(i) == delimiter) W++;
			String[] tokens10 = new String[W+1];
				    
				  
			int right10 = 0, left10 = 0;
			for (int i = 0; i < W; i++) {
				    while(Black.charAt(right10) != delimiter)
				        right10++;
				    tokens10[i] = Black.substring(left10, right10);
				    right10++;
				    left10 = right10;
				    }
				    tokens10[W] = Black.substring(right10, Black.length());
				    
			for (int i = 0; i < tokens.length; i++){
					for(int x = 0; x < tokens10.length; x++){
					int result = tokens[i].compareToIgnoreCase(tokens10[x]);
					if (result == 0) Blackmatches++;
						  
						}
					
					  }
				
			//White tokenizer and word checker
			int X = 0;
			for (int i = 0; i < White.length(); i++)
				if (White.charAt(i) == delimiter) X++;
			String[] tokens11 = new String[X+1];
				
				  
			int right11 = 0, left11 = 0;
			for (int i = 0; i < X; i++) {
				 	while(White.charAt(right11) != delimiter)
				            right11++;
				    tokens11[i] = White.substring(left11, right11);
				    right11++;
				    left11 = right11;
				    }
				    tokens11[X] = White.substring(right11, White.length());
				    
			for (int i = 0; i < tokens.length; i++){
					for(int x = 0; x < tokens11.length; x++){
					int result = tokens[i].compareToIgnoreCase(tokens11[x]);
					if (result == 0) Whitematches++;
						  
						}
					
					  }
				    
				    //Clear tokenizer and word checker
				    int Y = 0;
				    for (int i = 0; i < Clear.length(); i++)
				        if (Clear.charAt(i) == delimiter) Y++;
				    String[] tokens12 = new String[Y+1];
				
				  
				    int right12 = 0, left12 = 0;
				    for (int i = 0; i < Y; i++) {
				        while(Clear.charAt(right12) != delimiter)
				            right12++;
				        tokens12[i] = Clear.substring(left12, right12);
				        right12++;
				        left12 = right12;
				    }
				    tokens12[Y] = Clear.substring(right12, Clear.length());
				    
				    for (int i = 0; i < tokens.length; i++){
						for(int x = 0; x < tokens12.length; x++){
						  int result = tokens[i].compareToIgnoreCase(tokens12[x]);
						  if (result == 0) Clearmatches++;
						  
						}
					
					  }
			  
}
}