// Starts with A and ends with Z

public class FiniteAutomata {

    private int index = 0;
    private int indexTerminate;

    private String input;

    private void increment() {
        
        index = index < indexTerminate ? index + 1 : index;
    
    }

    private boolean isLastChar() {
        
        return index == indexTerminate;
    
    }

    private boolean isChar(int index, char character) {
        
        return input.charAt(index) == character;
    
    }

    private void reject() { System.out.println("REJECT"); }

    private void accept() { System.out.println("ACCEPT"); }

    public FiniteAutomata(String input) {

        this.input = input;

        indexTerminate = input.length() - 1;

        q0();

    }

    // START STATE
    // REJECTION  STATE
    private void q0() {
        
        if (isChar(index, 'a')) { q1(); }

        else { reject(); }

    }

    // STATE 1
    // REJECTION  STATE
    private void q1() {

        increment();
        
        if (isChar(index, 'z')) { q2(); }

        else {

            if (isLastChar()) { reject(); }

            else { q1(); }

        }

    }

    // STATE 2
    // ACCEPTANCE STATE
    private void q2() {

        increment();

        if (isChar(index, 'z')) {

            if (isLastChar()) { accept(); }

            else { q2(); }

        }

        else { q1(); }

    }

}