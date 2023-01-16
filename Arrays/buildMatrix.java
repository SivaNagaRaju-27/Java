package Arrays;
import java.util.*;
public class buildMatrix {
    int r,c;
    int mat[][];
    buildMatrix(int x, int y){
        r = x;
        c = y;
    }

    public int[][] build(int limit){
        int i,j;
        var rand = new Random();
        mat = new int[r][c];
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                mat[i][j] = rand.nextInt(limit);
            }
        }
        return mat;
    }
}
