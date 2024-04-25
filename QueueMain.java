package Pertemuan9;

public class QueueMain {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        //sebelum enqueue 3x
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.println();

        //sesudah enqueue 3x
        System.out.println("### Sesudah enqueue 3x ###");
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        System.out.println("size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.println("FRONT : " + queue.FRONT());

    }
}
