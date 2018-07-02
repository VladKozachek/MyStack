package SimpleQueue;

public class Main {
    public static void main(String[] args) {
        SimpleQueue simpleQueue=new SimpleQueue(10);
        simpleQueue.insert(10);
        simpleQueue.insert(20);
        simpleQueue.insert(30);
        simpleQueue.insert(40);
        simpleQueue.insert(50);
        simpleQueue.insert(60);
        simpleQueue.insert(70);
        simpleQueue.insert(80);
        simpleQueue.insert(90);
        simpleQueue.insert(100);
        simpleQueue.insert(110);

        while (!simpleQueue.isEmpty()){
            long tmp=simpleQueue.remove();
            System.out.println(tmp);
        }

    }
}
