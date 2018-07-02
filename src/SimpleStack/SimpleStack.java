package SimpleStack;

public class SimpleStack <E> {
    private int maxSize=10;
    private  Object [] stackeArray;
    private int top;

    public SimpleStack() {
        this.stackeArray=  new Object[maxSize];
        this.top = -1;
    }

    public void push(Object o) {   //добавляем єлемент
        stackeArray[++top] =o;
    }


    public Object pop() {         //выводим удаляем элемент
        return stackeArray[top--];
    }

    public Object peek() {   //выводим элемент
        return stackeArray[top];
    }

    public boolean isEmpty() {   //проверяем пустая очередь или нет
        return top==-1;
    }
    public void get() {                        // Выводим очередь
        for (int i = 0; i < top+1; i++) {
            System.out.println(stackeArray[i]);

        }
    }
}
