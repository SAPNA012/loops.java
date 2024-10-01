package basicJava.org.com;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /*loops statement are those statement that perform one task multiple time
		   types of FOR-LOOP
          for(initialization;condition;increment){
           //code }*/
		
		
		//(code-for-loop)
		int count=0;
		for(count=0;count<=20;count++) {
			System.out.println("Hello! JAVA>>>");}
		
		
		
		//while loop
		int c=2; //Initialize
		while(c==2) {//condition (2=2)true
			System.out.println("Hello! these is while loop");
			//increment
			c++;//c=c+1;
		}
		
		
		
		//DO-WHILE loop
		
		int i=0;//initialize
		do {
			System.out.println("Do-while");
			i++;//increment
			
		}while(i<10);//(boolean value true/false)
		
		/*******end of do while loop********/
		
		
		
		
	}

}
