import java.util.*;
import java.lang.*;


public class Menu {

    private int numStates;
    private ArrayList<Integer> finalStates = new ArrayList<Integer>();
    //private State[] states;
    private char[] binary = { '0','1' };
    private char[] alpha = {
        'a', 'b', 'c', 'd', 'e',
        'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o',
        'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y', 'z'
    };
    private char[][] languges = { binary, alpha };
    private int languge;
    
    public Menu() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the FSM Generator for CS 506, the best computer science class in the world!\n\n");
        System.out.println("FSMs have the following notation { Q, ∑, q, F, δ }.");
        System.out.println("Together let's define: \n");
        System.out.println("a) Our set of States (Q)");
        System.out.println("b) The transition functions for each state (δ)");
        System.out.println("c) Our set of input symbols (∑)");
        System.out.println("d) Our set of final states (F)\n\n");
        System.out.print("Let's start with our set of states. How many states would you like?: ");
        numStates = scan.nextInt();
        System.out.print("Next our set of input symbols. Enter 'binary' for [0-1] and 'alpha' for [a-z]: " );
        String lang = scan.next();
        languge = lang.equals("binary") ? 0 : 1;
        boolean inputDone = false;
        int finalStatesInput;
        while (!inputDone) {
            System.out.print("Starting from 0, enter the indexes of the states you want to make final states (enter -1 when done): " );
            finalStatesInput = scan.nextInt();
            if (finalStatesInput == -1) {
                inputDone = true;
            }
            else {
                finalStates.add(Integer.valueOf(finalStatesInput));
            }
        }
        System.out.println("");
        System.out.println("Now, we will enter our states one by one, defining their transition functions." );



    }

    public int getNumStates() {
        return numStates;
    }

    public ArrayList<Integer> getFinalStates() {
       return finalStates;
    }


    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        

    }

}

