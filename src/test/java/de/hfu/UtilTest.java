package de.hfu;
import org.junit.Test;

import junit.framework.TestCase;


public class UtilTest extends TestCase {
    

	@Test(expected=IllegalArgumentException.class)
    public void testUtilCase() {
    	
   Util.istErstesHalbjahr(20);

    

    }
}
