/*
 * Ciclos,Serie de números impares y fibomacci
 */
package ciclosfibonacciect;
/**
 * @author Monse Alba
 */
public class CiclosFibonacciEct {
    
    public static void main(String[] args) {
        //Algoritmos ciclicos
        //Serie de fibonacci 0,1,1,2,3,4,5,8,11
        //Serie de numeros impares
        
        int x=1;
        int anterior=0;
        int temp;
        while(true)
        {
            System.out.println(x);
            temp=x;
            x=x+anterior;
            anterior=temp;
            
            if(x>100)
            {
                break;
            }
                
        }
    }
    
}
