package tuto4;


import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class TestCalc 
    extends TestCase
{
	  Calc cal=new Calc();
	  @Test
	  public void testAdd(){
		 int r=cal.add(1,0);
	        Assert.assertEquals(1,r);
	    }
	  @Test
	  public void testSubtract(){
			 int r=cal.substact(5,3);
		        Assert.assertEquals(1,r);
		    }
	  

}
