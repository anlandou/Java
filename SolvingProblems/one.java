
public class one {
	
	public static void main(String args []) {
		
		/*Drawing Patterns 
		 * Print the following shapes using loop(s)
        
1*****		12345&		@
12****		1234&&		@ @
123***		123&&&		@   @
1234**		12&&&&		@     @
12345*		1&&&&&		@       @
123456		&&&&&&		@ @ @  @  @
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		int keeper = 1; 
		String agent = ""; 
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				
				if(keeper == j) {
					agent+= Integer.toString(j); 
					System.out.print(agent);
				}
				
				else if(j > keeper) {
					System.out.print("*");
				}
			}
			
			keeper++;
			System.out.println(""); 
		}
		
	}

}
