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
	  public void testAdd(){
		  Calc cal=new Calc();
            int r=cal.add(1,0);
	        Assert.assertEquals(1,r);
	    }
	  

}
