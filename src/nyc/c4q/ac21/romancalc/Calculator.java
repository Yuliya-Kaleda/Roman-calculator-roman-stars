package nyc.c4q.ac21.romancalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculator {
    /**
     * Performs calculations on Roman numerals and prints the result.
     *
     * If either of the numbers are not Roman numerals, or if the operation is
     * unrecognized, prints an error message.  Otherwise, performs the
     * operation and prints the result in Roman numerals.  If the result is
     * less than 1 or larger than 3999, prints a message indicating this
     * instead.
     *
     * @param leftNumber
     *   The left operand, in Roman numerals.
     * @param operation
     *   The operator, which may be,
     *   - "+" for addition,
     *   - "-" for subtraction,
     *   - "*" for multiplication,
     *   - "/" for (integer) division,
     *   - "%" for remainder,
     *   - "#" to average the two numbers.
     * @param rightNumber
     *   The right operand.
     */
    public static void calculate(String leftNumber, String operation, String rightNumber) {
        // Group 3: Write this function!
        boolean numValid = true;
        boolean opValid = true;
        int leftInt, rightInt;
        int resultInt = 0;


        leftInt = RomanNumerals.parse(leftNumber);
        rightInt = RomanNumerals.parse(rightNumber);

        //leftInt = parseDecimalNumber(leftNumber);
        //rightInt = parseDecimalNumber(rightNumber);

        // This block prints 'invalid number' to the console if user input is not a roman numeral
        if (leftInt == -1) {
            numValid = false;
            System.out.println("invalid number: " + leftNumber);
        }
        if (rightInt == -1) {
            numValid = false;
            System.out.println("invalid number: " + rightNumber);
        }

        if (operation.equals("+") || operation.equals("-") || operation.equals("*") ||
                operation.equals("/") || operation.equals("%") || operation.equals("#")) {
            opValid = true;
        } else {
            opValid = false;
            System.out.println("invalid operation");

        }

        // This block performs the operation if user input is valid
        if (numValid == true && opValid == true) {

            //Addition
            if (operation.equals("+")) {
                resultInt = leftInt + rightInt;
            }

            //Subtraction
            else if (operation.equals("-")) {
                resultInt = leftInt - rightInt;
            }

            //Multiplication
            else if (operation.equals("*")) {
                resultInt = leftInt * rightInt;
            }

            //Division
            else if (operation.equals("/")) {
                resultInt = leftInt / rightInt;
            }

            //Modulo
            else if (operation.equals("%")) {
                resultInt = leftInt % rightInt;
            }

            //Average
            else if (operation.equals("#")) {
                resultInt = (leftInt + rightInt)/2;
            }


            // Formats and displays the result

            if(opValid && numValid) {

                // If result is in range, formats to roman numeral and displays to console
                if (resultInt <= 0 || resultInt >= 4000) {
                    System.out.println("result out of range");
                } else {
                    System.out.println(RomanNumerals.format(resultInt));
                }
            }




        }


    }

    /**
     * Parses a decimal number.
     * @param number
     *   A decimal number, e.g. "459".
     * @return
     *   The value of the number, or -1 if it cannot be parsed.
     * @note
     *   This function is for testing only.  It should not be used in the final program.
     * @note
     *   You do not need to understand how this function works.
     */
    public static int parseDecimalNumber(String number) {
        try {
            return Integer.valueOf(number);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    /**
     * @note
     *   You do not need to understand how this function works.
     */
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Loop forever.
        while (true) {
            // Show the prompt.
            System.out.print("> ");
            // Read a line of input.
            final String line = reader.readLine();
            if (line.length() == 0) {
                System.out.println("done");
                break;
            }
            // Scan the line into three parts: two numbers with an operator between them.
            final Scanner scanner = new Scanner(line);
            final String leftNumber, operation, rightNumber;
            try {
                leftNumber = scanner.next();
                operation = scanner.next();
                rightNumber = scanner.next();
            }
            catch (NoSuchElementException e) {
                System.err.println("syntax error");
                System.out.println();
                continue;
            }

            // Perform the calculation and show the result.
            calculate(leftNumber, operation, rightNumber);

            System.out.println();
        }
    }
}
