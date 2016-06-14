import java.util.Random;
public class Randomcomp {

	public static void main(String[] args) {
		
		int dienumber;
		output("Generate 10 random integers between 1 and 6");
        Random rnd =new Random();
        for (int i = 1; i <= 6; ++i)
        {
        dienumber = 1 + rnd.nextInt(6-1);
        
        System.out.println("Your die roll was : " + dienumber);
        }
	    
        output("Done.");
    }
  
  private static void output(String aMessage)
  {
    System.out.println(aMessage);
  }

}
