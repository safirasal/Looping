/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author sfrsl
 */
public class ukla2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a[][]={{2,5},{5,3}};
       int b[][]={{4},{3}};
       int h[][]={{0},{0}};
       System.out.println("Hasil AxB");
       for (int i=0;i<2;i++){
           for (int j=0;j<1;j++){
               for(int k=0;k<2;k++){
                   h[i][j]=h[i][j]+a[i][k]*b[k][j];
                   
               }
           }
    }
       for (int i=0;i<2;i++){
           for (int j=0;j<1;j++){
               System.out.print(h[i][j]+"\t");
           }
           System.out.println();
    }
    
    }
}
