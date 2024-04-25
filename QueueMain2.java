package Pertemuan9;

public class QueueMain2 {
    public static void main(String[] args) {
        StrukturQueue queue = new StrukturQueue();

        //sebelum ENQUEUE 4x
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size : " + queue.size());
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.print("Elemen Queue :");
        queue.displayElement();

        //sesudah enqueue 4x
        System.out.println("### Sesudah Enqueue 4x ###");
        System.out.println("size : " + queue.size());
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);
        System.out.println("IsEmpty : " + queue.isEmpty());
        System.out.print("Elemen Queue :");
        queue.displayElement();
        System.out.println("FRONT : " + queue.FRONT());



    }
}
