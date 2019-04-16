import java.util.*;

public class Stack1 {

    private int[] stackArr = new int[1];

    public void StackPractice() {


    }

    public void push(int item) {

        stackArr = copyArr(1);

        stackArr[stackArr.length - 1] = item;

    }

    public int pop() {

        int returnedItem = stackArr[stackArr.length - 1];

        stackArr = copyArr(-1);

        return returnedItem;
    }

    private int[] copyArr(int direction) {

        int[] arrCopy = new int[stackArr.length + direction]; 

        for(int i = 0; i < (direction == 1 ? stackArr.length : stackArr.length - 1); i++) {

            arrCopy[i] = stackArr[i];
            
        }

        return arrCopy;

    }

    public void printStack() {

        String stack = "";

        for(int n : stackArr) {

            stack += n + " ";

        }

        System.out.println(stack);

    }

} 