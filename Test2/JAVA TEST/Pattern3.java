
public class Pattern3 {
    public static void main(String[] args) {
        int size = 3; 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Outout
// %%%
// % %
// %%%
