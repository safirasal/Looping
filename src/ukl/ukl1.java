package ukl;

/**
 *
 * @author sfrsl
 */
public class ukl1 {

    public static void main(String[] args) {
        //int a = 17 selisih b = 7 suku ke 10-20
       int a = 17;
       int b = 7;
       int c = 20;
       int d;
       int total = 0;
       System.out.println("Deret Aritmatika :");
       
       for (int i = 10; i <= c; i++) {
           d = a + (10-1) * b;
           a += b;
           
           System.out.println ("Suku ke-"+i+" = "+d);
           
           total += d;
       }
       System.out.println("Total nilai deret aritmatika = "+total);
       }
    }

    

