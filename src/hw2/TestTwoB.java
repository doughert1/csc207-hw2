package hw2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTwoB
{
/**
 * Tests the average() method for the subtle bug present in the 
 * original code. 
 */
  @Test
  public void
    testAverage ()
  {
   assertEquals ("3 and 4", 3, TwoB.average (3, 4));
   assertEquals ("-2 and -5", -3, TwoB.average (-2, -5));
   assertEquals ("-2 and 3", 0, TwoB.average (-2, 3));
   assertEquals ("2 and 2", 2, TwoB.average (2, 2));
   assertEquals ("999 and 9999", 999999972, TwoB.average (999999999, 999999945));
   assertEquals ("max and 3", 1073741825, TwoB.average (Integer.MAX_VALUE, 3));
   assertEquals ("max and 455", 1073742051, TwoB.average (Integer.MAX_VALUE, 456));
   assertEquals ("max and 455", -1073741596, TwoB.average (Integer.MIN_VALUE, 456));
  }//testAverage

}//TestTwoB
