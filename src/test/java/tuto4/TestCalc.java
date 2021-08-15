package tuto4;


import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class TestCalc 
    extends TestCase
{
	  Calc cal=new Calc();
	  public void testAdd(){
		 int r=cal.add(1,0);
	        Assert.assertEquals(1,r);
	    }
	  
	  public void testSubtract(){
			 int r=cal.substact(5,3);
		        Assert.assertEquals(1,r);
		    }
	  

}
