//import junit.framework.Assert;
                import org.junit.Ignore;
                import org.junit.Test;
import org.junit.Assert;
                import java.util.Random;
                                
                /**  
                 * Created by dshmaya on 15/11/2017 ...04
                */  
                public class SimpleTest {
                 
                                
                   @Test  
                   public void alwaysPass1()
                   {
                    
                       Assert.assertEquals(1, 2);
                   }
                

                   @Test
                    public void alwaysPass2()
                    {
                        Assert.assertEquals(1, 2);
                        System.out.println("proba");
                    }
                   @Test  
                   public void alwaysPass3()
                   {
                       Assert.assertEquals(1, 2);
                   }

                    @Test
                    public void alwaysPassD()
                    {
                        Assert.assertEquals(1, 2);
                    }

                    @Test
                    public void alwaysPass4()
                    {
                        Assert.assertEquals(1, 3);
                    }
                    @Test
                    public void alwaysPassA()
                    {
                        Assert.assertEquals(1, 2);
                    }
                    @Test
                    public void alwaysPassB()
                    {
                        Assert.assertEquals(1, 2);
                    }
                   @Test
                   public void alwaysFail5()
                   {
                       Assert.assertEquals(1, 2);
                   }


                  @Test
                    public void alwaysPass6()
                    {
                        Assert.assertEquals(1, 2);
                    }
                    @Test
                    public void alwaysPassC()
                    {
                        Assert.assertEquals(1, 2);
                    }
                  @Test
                    public void alwaysPass7()
                    {
                        Assert.assertEquals(1, 2);
                    }
                 @Test
                   public void alwaysFail81()
                   {
                       Assert.assertEquals(1, 8);
                   }
                  @Test
                   public void alwaysFail91()
                   {
                       Assert.assertEquals(1, 3);
                   }
                  @Test
                   public void alwaysFail10()
                   {
                       Assert.assertEquals(1, 5);
                       System.out.println("Neata!");
                   }
                  @Test
                   public void alwaysFail11()
                   {
                       Assert.assertEquals(1, 3);
                   }
                  @Test
                   public void alwaysFail12()
                   {
                       Assert.assertEquals(1, 2);
                   }
                  @Test
                   public void alwaysFail13()
                   {
                       Assert.assertEquals(1, 3);
                   }
                    @Test
                    public void alwaysFailE()
                    {
                        Assert.assertEquals(1, 4);
                        System.out.println("Neata2!");
                    }
                  
                    @Test
                    @Ignore
                    public void ignored1()
                    {
                        Random random = new Random();
                        int randomNumber = random.nextInt(99);
                        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
                        Assert.assertEquals(smallerThanFiftee, true);            
                    }
                                
                   @Test
                   @Ignore
                    public void ignored2()
                    {
                        Random random = new Random();
                        int randomNumber = random.nextInt(100);
                        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
                        Assert.assertEquals(smallerThanFiftee, true);
                    }
    @Test	
    public void sometimesPass888200()
    {

         Random random = new Random();
         int randomNumber = random.nextInt(100);
         boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
         Assert.assertEquals(smallerThanFiftee, true);
        
    }
			
    @Test
    public void sometimesPass888198()
    {

         Random random = new Random();
         int randomNumber = random.nextInt(100);
         boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
         Assert.assertEquals(smallerThanFiftee, true);
     }
}
