public class pattern {
    public static void main(String[] args) {

        int size = 10,i,j,k;
        for ( i = 0; i < size; i++) {
            // print spaces
            for (j = 1; j < size - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( i = 1; i < size; i++) {
            // print spaces
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (j = size; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
