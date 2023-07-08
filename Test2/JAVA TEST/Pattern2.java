public class Pattern2 {
    public static void main(String[] args) {
        int size = 3; 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j){
                     System.out.print("&");
                 }
                 System.out.print(" % ");
                 
            }
            System.out.println();
        }
    }
}

// output
// % % %
// % & %
// % % %