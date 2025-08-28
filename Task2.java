public class Main {
    public static void main(String[] args) {
        // Here we're using a single character, not an integer 'o'.
        byte zero = 0; // The integer 0 is a primitive type
        
        // This is a character literal. Single quotes are used for characters.
        char oh = 'o'; 

        // Let's create all the primitives needed for the desired output.
        // byte, short, int, long, float, double, char, boolean
        
        // Let's create the necessary values to get the desired output "H3110 world 2.0 true"
        char h = 'H';
        int threeOneOneZero = 3110;
        String spaceWorld = " world ";
        float twoPointZero = 2.0f;
        boolean trueValue = true;

        // Concatenate all of the variables into a single String
        String output = h + "" + threeOneOneZero + spaceWorld + twoPointZero + " " + trueValue;
        
        System.out.println(output);
    }
}
