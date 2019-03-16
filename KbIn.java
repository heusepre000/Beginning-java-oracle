// Read a character from the keyboard.
public class KbIn {
    public static void main(String args [])
        throws java.io.IOException {

        char ch;

        System.out.print("Press a key followeed by ENTER: ");

        ch = (char) System.in.read(); // get a char

        System.out.println("your key is: " + ch);
    }

}
