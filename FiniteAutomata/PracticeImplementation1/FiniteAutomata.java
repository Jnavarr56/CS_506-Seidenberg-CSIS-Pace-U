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
        
        if (this.input.charAt(index) == 'a') {

            this.q1();

        }

        else {

            this.reject();

        }

    }

    // FINAL REJECT
    private void q1() {

        this.index = this.index < this.indexTerminate ? this.index + 1 : this.index;
        
        if (input.charAt(this.index) == 'z') {

            this.q2();

        }

        else {

            if (this.index == this.indexTerminate) {

                this.reject();

            }

            else {

                this.q1();

            }

        }

    }

    // FINAL ACCEPT
    private void q2() {

        this.index = this.index < this.indexTerminate ? this.index + 1 : this.index;

        if (input.charAt(this.index) == 'z') {

            if (this.index == this.indexTerminate) {

                this.accept();

            }

            else {

                this.q2();

            }

        }

        else {

            this.q1();

        }


    }

}