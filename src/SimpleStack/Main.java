package SimpleStack;


public class Main {
    public static void main(String[] args) {
        SimpleStack <Integer>simpleStack=new SimpleStack();

        simpleStack.push(10);
        simpleStack.push(20);
        simpleStack.push(30);
        simpleStack.push(40);

        simpleStack.pop();

        System.out.println(simpleStack.peek());

        simpleStack.get();
    }
}
