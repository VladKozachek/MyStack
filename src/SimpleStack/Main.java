package SimpleStack;


public class Main {
    public static void main(String[] args) {
   //Пример 1
        SimpleStack <Integer>simpleStack=new SimpleStack();

        simpleStack.push(10);
        simpleStack.push(20);
        simpleStack.push(30);
        simpleStack.push(40);

        simpleStack.pop(); //удаляем элемент

        simpleStack.get();

        System.out.println();

        //Пример 2

        SimpleStack <String>strokaStack=new SimpleStack();

        strokaStack.push("Hello1");
        strokaStack.push("Hello2");
        strokaStack.push("Hello3");
        strokaStack.get();

        //Пример 3
        System.out.println();

        SimpleStack <Animals>animalsStack=new SimpleStack();

        animalsStack.push(new Animals("Dog",10));
        animalsStack.push(new Animals("Cat",5));
        animalsStack.push(new Animals("Pinguage",2));

        animalsStack.get();


    }
}
