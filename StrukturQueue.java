package Pertemuan9;

public class StrukturQueue {

    private Node FRONT;
    private Node REAR;

    //mengecek apakah queue kosong atau tidak
    boolean isEmpty(){
        return FRONT == null;
    }

    //menambahkan elemen kedalam queue
    public void enqueue(int data){
        Node newNode = new Node (data);
        if(isEmpty()){ 
            FRONT = newNode; // jika kosong Node baru menjadi node pertama(front)
            REAR = newNode; //Node baru juga jadi node terakhir
        }else{ 
            REAR.setNext(newNode); //jika ada maka menambahkan node baru setelah node terakhir
            REAR = newNode; //REAR diupdate agar menjadi node baru
        }
        return;
    }

    //menghitung total elemen didalam queue
    public int size(){
        int size = 0;
        Node curNode = FRONT;
        while(curNode != null){
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    //untuk mendapatkan nilai dari elemen pertama dalam queue
    public int FRONT(){
        return FRONT != null ? FRONT.getData() : -1;
    }

    //menghapus dan mengembalikan elemen pertama dari queue
    public int dequeue(){
        Node temp;
        int dequeueItem = Integer.MIN_VALUE;
        if(FRONT != null){
            if(FRONT == REAR){
                dequeueItem = FRONT.getData(); //mengambil data nilai dari elemen pertama
                FRONT = null; //mengosongkan FRONT
                REAR = null; //mengosongkan REAR
            }else{
                temp = FRONT; //elemen pertama disimpan sementara
                dequeueItem = temp.getData();
                FRONT = FRONT.next; //menggeser FRONT ke elemen selanjutnya
                temp = null; //menghapus elemen pertama yang disimpan
            }
        }
        return dequeueItem;
    }

    //menampilkan isi queue ke layar
    public void displayElement() { //untuk menampilkan hasil ke layar
		Node curNode = FRONT;
		
        if(curNode == null){
            System.out.println("\n Queue Kosong!!");
        }
		while(curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}

}
