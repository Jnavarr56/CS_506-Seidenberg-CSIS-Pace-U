public class StructureTest {

    public static void main(String args[]) {

        Stack1 testStack = new Stack1();

        testStack.push(1);
        testStack.push(2);
        testStack.push(3);

        testStack.printStack();

        System.out.println(testStack.pop());

        testStack.printStack();

    }

}