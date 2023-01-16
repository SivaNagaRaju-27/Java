package Inheritance;

import java.util.*;
public class readM_trix {
    static int mat[][];
    static int i,j,r,c,ord;

    static int[][] read(int random) {
        var sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: "); 
        r = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        c = sc.nextInt();
        
        var rand = new Random();
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                //System.out.print("Enter Element["+(i+1)+"]["+(j+1)+"]: ");
                mat[i][j] = rand.nextInt(random);
            }
        }
        return mat;
    }

    static void display(int m[][]){
        int r = m.length;
        int c = m[0].length;
        int rsize = 0;
        int clen[] = new int[c];

        String str[][] = new String[r][c];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                str[j][i] = Integer.toString(m[j][i]);
                if(clen[i] < str[j][i].length()){
                    clen[i] = str[j][i].length();
                }
            }
            rsize += clen[i];
        }

        System.out.print("    *");
        for(int i=0; i<rsize+c+2; i++){
            if((rsize+c+1)%2 == 0){
                if(i==(rsize+c+1)/2-3){
                    System.out.print("MATRIX");
                    i += 5;
                }
                else System.out.print("*");            
            }else{
                if(i==(rsize+c+1)/2-3){
                    System.out.print("MAT-RIX");
                    i += 6;
                }
                else System.out.print("*");
            }
        }
        System.out.println();

        for(int i=0; i<r; i++) {
        
            for(int j=0; j<c; j++) {

                if(j==0){
                    System.out.print("     |");
                    if(str[i][j].length() < clen[j]){
                        for(int l=str[i][j].length(); l<clen[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+" ");
                }

                else if(j==m[i].length-1){
                    if(str[i][j].length() < clen[j]){
                        for(int l=str[i][j].length(); l<clen[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+"|");
                }

                else{
                    if(str[i][j].length() < clen[j]){
                        for(int l=str[i][j].length(); l<clen[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+" ");
                }

                if(m[0].length == 1) System.out.print("\b|");
            }
            System.out.println();
        }
    }
}
