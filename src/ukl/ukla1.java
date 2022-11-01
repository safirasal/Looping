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
public class ukla1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3 6 4 4
        //5 2 3 3
        int a[][]={{3,6},{4,4}};
        int b[][]={{5,2},{3,3}};
        System.out.println("Hasil A-B");
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.print(a[i][j]-b[i][j]+"\t");
            }
            System.out.println();
            }
        }
    }
    

