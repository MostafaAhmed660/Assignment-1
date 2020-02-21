
package ical;

import org.junit.Test;

import static org.junit.Assert.*;


public class testaddinganddivide {
    @Test
    public void addTest() {
        Calculator test = new Calculator();
        int answer = test.add(3,0);
        assertEquals(3,answer);
        
        Calculator test = new Calculator();
        int answer = test.add(3,-1);
        assertEquals(2,answer);
        
        Calculator test = new Calculator();
        int answer = test.add(20,-20);
        assertEquals(0,answer);
     
    }
    
    @Test
    public void divideTest() {
        Calculator test2 = new Calculator();
        float answer2 = test2.divide(3,2);
        assertEquals(1.5f,answer2,0.001);
       
        answer2 = test2.divide(3,3);
        assertEquals(1.0f,answer2,0.001);
        
        answer2 = test2.divide(-10,5);
        assertEquals(-2.0f,answer2,0.001);
        
        try {
            answer2 = test2.divide(2,0);
            fail();
        }
        catch (IllegalArgumentException ex){
            assertEquals("Math ERROR : Divide by zero",ex.getMessage());
        }
    
    }

}
