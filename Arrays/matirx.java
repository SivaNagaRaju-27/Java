package Arrays;

public class matirx {
    public static void main(String args[])throws Exception{
        int[][][] mats;
        int i,j,n,limit;
        int[][] ord;
        String str;

        var ob1 = new read();
        buildMatrix ob2[];
        var ob3 = new printMatrix();

        n = ob1.Read("How many Matrices you want to build");
        
        ord = new int[n][2];
        mats = new int[n][][];
        ob2 = new buildMatrix[n];

        for(i=0; i<n; i++){
            System.out.println("Building Matrix-["+(i+1)+"]...");
            for(j=0; j<2; j++){
                if(j == 1) str = "Row";
                else str = "column";
                ord[i][j] = ob1.Read("Enter "+str+" Order Of Matrix");
            }
            ob2[i] = new buildMatrix(ord[i][0], ord[i][1]);
            limit = ob1.Read("Enter limit");
            mats[i] = ob2[i].build(limit);
        }

        for(i=0; i<n; i++){
            System.out.println("\nMatrix-["+ (i+1) +"]...");
            ob3.display(mats[i]);
        }
    }
}
