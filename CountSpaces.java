public class CountSpaces {
    public static void main(String args[])
        throws java.io.IOException {

        System.out.println("Enter a sentence ending with a period.");
        char x;
        x = ' ';
        int sum = 0;
        do {
            x = (char) System.in.read();
            if (x == ' ') {
                sum = sum + 1;
            }
        } while (x != '.');
        System.out.println("Total number of spaces equals---> " + sum);
    }
}
