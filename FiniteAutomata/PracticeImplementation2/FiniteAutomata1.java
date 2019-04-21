//https://www.tutorialspoint.com/automata_theory/non_deterministic_finite_automaton.htm
//https://www.geeksforgeeks.org/practice-problems-finite-automata/
/* Que-1:   Draw a deterministic and non-deterministic finite automate
            which accept 00 and 11 at the end of a string containing 
            0, 1 in it, e.g., 01010100 but not 000111010.
*/
//DFA
public class FiniteAutomata1 {

    private int index = 0;

    private int indexTerminate;

    private String input;

    private void reject() { System.out.println("REJECT"); }

    private void accept() { System.out.println("ACCEPT"); }

    private void increment() {

        index = index < indexTerminate ? index + 1 : index;
    
    }

    private boolean isLastChar() {
        
        return index == indexTerminate;
    
    }

    private boolean isChar(char character) {
        
        return input.charAt(index) == character;
    
    }

    public FiniteAutomata1(String input) {

        this.input = input;

        indexTerminate = input.length() - 1;

        q0();

    }

    private void q0() {
        
        if (isChar('0')) {

            q1();

        }

        else {

            q2();

        }

    }


    private void q1() {

        System.out.println("Q1");

        if (isLastChar()) { reject(); return; }

        increment();

        if (isChar('0')) {

            q3();

        }

        else {

            q2();

        }

    }

    private void q3() {

        System.out.println("Q3");

        if (isLastChar()) { accept(); return; }

        increment();
        
        if (isChar('0')) {

            q3();

        }

        else {

            q2();

        }

    }

    //----------------------
    
    private void q2() {

        System.out.println("Q2");

        if (isLastChar()) { reject(); return; }

        increment();

        if (isChar('1')) {

            q4();

        }

        else {

            q1();

        }

    }

    private void q4() {

        System.out.println("Q4");

        if (isLastChar()) { accept(); return; }

        increment();

        if (isChar('1')) {

            q4();

        }

        else {

            q1();

        }

    }

}