package SimpleQueue;
// Создаем свою очередь
public class SimpleQueue {
    private int maxSize;
    private  long []queueArray;
    private int front;
    private int rear;
    public int nItems;

    public SimpleQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        this.front = 0;   //флаг последнего элемента
        this.rear = -1;   //флаг первого элемента
        this.nItems = 0;  // размер очереди
    }

    public void insert(long element) {  // добавляем элемент в очередь
        if(rear == maxSize-1){         // проверяем, если добавляемый элемент больше чем размер массива, то перезаписываем
            rear = -1;                 // первые
        }
        queueArray[++rear]=element;
        nItems++;
    }

    public boolean isEmpty() {       //проверяем пустая очередь или нет
        return (nItems==0);
    }

    public long remove() {                       // удаляем элемент из очереди
        long tmp =queueArray [front++];          // проверяем, если удаляемый элемент больше чем размер массива, то
        if(front==maxSize){                      // удаляем заново первые
            front=0;
        }
        nItems--;
        return tmp;
    }

}
