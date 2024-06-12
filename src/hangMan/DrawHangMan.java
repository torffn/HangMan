package hangMan;

public class DrawHangMan {
	public static void drawHang(int countFalse) { 
		  switch(countFalse) { 
		  case 0: 
		   System.out.println(""" 
		                    _______                
		                    |   \\    | 
		                    |   
		                    |   
		                    |   
		                    | 
		                    ~~~~~~~ 
		                    """); 
		   break; 
		  case 1:  
		   System.out.println(""" 
		                    _______                
		                    |   \\    | 
		                    |   () 
		                    |   
		                    |   
		                    | 
		                    ~~~~~~~ 
		                    """); 
		   break; 
		  case 2:  
		   System.out.println(""" 
		                    _______                 
		                    |   \\    | 
		                    |   () 
		                    |   [] 
		                    |   
		                    | 
		                    ~~~~~~~ 
		                    """); 
		   break; 
		  case 3:  
		   System.out.println(""" 
		                    _______                 
		                    |   \\    | 
		                    |   () 
		                    |  /[] 
		                    |   
		                    | 
		                    ~~~~~~~ 
		                    """); 
		   break; 
		  case 4:  
		   System.out.println(""" 
		                    _______                 
		                    |   \\    | 
		                    |   () 
		                    |  /[]\\ 
		                    |   
		                    | 
		                    ~~~~~~~ 
		                    """); 
		   break; 
		  case 5: 
		   System.out.println(""" 
		                    _______                 
		                    |   \\    | 
		                    |   () 
		                    |  /[]\\ 
		                    |  /    
		                    | 
		                    ~~~~~~~ 
		                    """); 
		   break; 
		  case 6: 
		   System.out.println(""" 
		                    _______                 
		                    |   \\    | 
		                    |   () 
		                    |  /[]\\ 
		                    |  /  \\ 
		                    | 
		                    ~~~~~~~ 
		                    """); 
		   break; 
		  } 
		 }
}
