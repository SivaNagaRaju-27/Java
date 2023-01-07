package Classes;
class disp{
    void display(int m[][]){
        int r = m.length;
        int c = m[0].length;
        int len[] = new int[c];

        String str[][] = new String[r][c];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                str[j][i] = Integer.toString(m[j][i]);
                if(len[i] < str[j][i].length()){
                    len[i] = str[j][i].length();
                }
            }
        }

        System.out.println();
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(j==0){
                    System.out.print("\t|");
                    if(str[i][j].length() < len[j]){
                        for(int l=str[i][j].length(); l<len[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+" ");
                }else if(j==m[i].length-1){
                    if(str[i][j].length() < len[j]){
                        for(int l=str[i][j].length(); l<len[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+"|");
                }else{
                    if(str[i][j].length() < len[j]){
                        for(int l=str[i][j].length(); l<len[j]; l++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print(m[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
public class Display {
    public static void main(String args[]){
        //int m[][];
        /*for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                m[i][j] = 5+(i*j)*5;
            }
        }*/
        /*var x = new ReadMatrix();
        m = x.read('a');
        disp d = new disp();
        d.display(m);*/
    }
}
