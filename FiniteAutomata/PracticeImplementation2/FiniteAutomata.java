// Starts with A and ends with Z

public class FiniteAutomata {

    private int index = 0;

    private int indexTerminate;

    private String input;

    private void reject() { System.out.println("REJECT"); }

    private void accept() { System.out.println("ACCEPT"); }

    public FiniteAutomata(String input) {

        this.input = input;

        this.indexTerminate = input.length() - 1;

    }

    public void run() {

        this.q0();

    }

    private void q0() {
        


    }


    private void q1() {

    }

    // FINAL ACCEPT
    private void q2() {

    }

}