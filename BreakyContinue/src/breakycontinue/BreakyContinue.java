package breakycontinue;
/**
 * @author MOnse Alba
 */
public class BreakyContinue {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Aun estas en el ciclo");
            
            if(i==4)
            {
                continue;
            }
            System.out.println("El balor de i es: "+i);
        }
    System.out.println("Has dejado el ciclo for");

    }
    
}
