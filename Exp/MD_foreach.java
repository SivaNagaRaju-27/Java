package Exp;
public class MD_foreach {
    public static void main(String args[]){
        int ar[][];
        int i,j;
        ar = new int[4][];
        ar[0] = new int[1];
        ar[1] = new int[2];
        ar[2] = new int[3];
        ar[3] = new int[4];

        for(i=0; i<4; i++){
            for(j=0; j<ar[i].length; j++){
                ar[i][j] = 4*(i+j)+1;
            }
        }
        
        for(int x[]: ar){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}