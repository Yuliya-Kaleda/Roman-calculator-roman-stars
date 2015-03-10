package nyc.c4q.ac21.romancalc;

/**
 * Code to convert to and from Roman numerals.
 */
public class RomanNumerals {
    /**
     * Formats a number in Roman numerals.
     * @param value
     *   The value to format.
     * @return
     *   The value in Roman numerals.
     */
    public static String format(int value) {
        // TODO: Group 1: Write this function!
        return "???";
    }

    /**
     * Parses a number in Roman numerals.
     * @param number
     *   The number to parse.
     * @return
     *   The value, or -1 if the number isn't in Roman numerals.
     */
    public static int parse(String number) {
        // TODO: Group 2: Write this function!
        return 0;
    }

    public static void main(String[] argv) {
        // TODO: Group 3: Write this function!
        // It should test that format() and parse() work correctly.

    // parse() TESTS:
        System.out.println("parse() tests:\n");

        // This block checks 'special combinations' for parse()

       int cmParse = parse("CM");
        if(cmParse == 900) {
            System.out.println("CM: Success");
        }else{
            System.out.println("CM: Fail " + cmParse);
        }

        int cdParse = parse("CD");
        if(cdParse == 400) {
            System.out.println("CD: Success");
        }else{
            System.out.println("CD: Fail " + cdParse);
        }

        int xcParse = parse("XC");
        if(xcParse == 90) {
            System.out.println("XC: Success");
        }else{
            System.out.println("XC: Fail " + xcParse);
        }

        int xlParse = parse("XL");
        if(xlParse == 40) {
            System.out.println("XL: Success");
        }else{
            System.out.println("XL: Fail " + xlParse);
        }

        int ixParse = parse("IX");
        if(ixParse == 9) {
            System.out.println("IX: Success");
        }else{
            System.out.println("IX: Fail " + ixParse);
        }

        int ivParse = parse("IV");
        if(ivParse == 4) {
            System.out.println("IV: Success");
        }else{
            System.out.println("IV: Fail " + ivParse);
        }


        // This block tests if parse() returns -1 when given input other than a roman numeral
        int notRoman = parse("banana");

        if(notRoman == -1) {
            System.out.println("Not Roman Input: Success");
        }else{
            System.out.println("Not Roman Input: Fail " + notRoman);
        }

    // format() TESTS
        System.out.println("\nformat() tests:\n");

        // This block checks 'special combinations' for format()

        String cmFormat = format(900);
        if(cmFormat.equals("CM")) {
            System.out.println("CM: Success");
        }else{
            System.out.println("CM: Fail " + cmFormat);
        }

        String cdFormat = format(400);
        if(cdFormat.equals("CD")) {
            System.out.println("CD: Success");
        }else{
            System.out.println("CD: Fail " + cdFormat);
        }

        String xcFormat = format(90);
        if(xcFormat.equals("XC")) {
            System.out.println("XC: Success");
        }else{
            System.out.println("XC: Fail " + xcFormat);
        }

        String xlFormat = format(40);
        if(xlFormat.equals("XL")) {
            System.out.println("XL: Success");
        }else{
            System.out.println("XL: Fail " + xlFormat);
        }

        String ixFormat = format(9);
        if(ixFormat.equals("IX")) {
            System.out.println("IX: Success");
        }else{
            System.out.println("IX: Fail " + ixFormat);
        }

        String ivFormat = format(4);
        if(ivFormat.equals("IV")) {
            System.out.println("IV: Success");
        }else{
            System.out.println("IV: Fail " + ivFormat);
        }

    }
}
