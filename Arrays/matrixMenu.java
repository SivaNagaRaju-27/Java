package Arrays;

public class matrixMenu {
    public int purposeMenu()throws Exception{
        char x;
        int opt;
        System.out.println("\t\t*****Menu*****");
        System.out.println("\t[1].Matrix Addition.");
        System.out.println("\t[2].Matrix Multiplication.");
        System.out.println("\t[3].Matrix Det.");
        System.out.print("Enter Your Option: ");
        x = (char) System.in.read();
        opt = x-'0';

        return opt;
    }
}
