public class Break6 {
    public static void main(String args[]) {
        int x = 0, y = 0;

        // here, put label before for statement
        stop1:
        for (x = 0; x < 5; y++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }

        System.out.println();

        // now, put label immediately before {
        for (x = 0; x < 5; x++)
            stop2:{
                for (y = 0; y < 5; y++) {
                    if (y == 2) break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }
    }
}
