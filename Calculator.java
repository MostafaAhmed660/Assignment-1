
package ical;


public class Calculator implements Calculate{
    
    
    public int add (int x , int y){
        return x + y ;
    }
    
    
    public float divide (int x ,int y){
        
        if (y == 0){
            throw new RuntimeException("Math ERROR : Divide by zero");
        }
        
        else{
            return (float)x / (float)y ;
        }
        
    }
    
}
