package mylinkedlist;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // Sau câu lenh nay, anh da tim duoc node cuoi cung, va duoc gan cho
        // temp
        // Nhiem vu cuôi cung: Naruto: The Last => Boruto: Naruto Next Generation
        temp.next = newNode;

    }
// 0
    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        } else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;
        }
    }
    public int length(){
        Node temp =head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void display(){
        Node temp = head;
        for(int i=0;i<length();i++){
            System.out.print(temp.getData());
            if(temp.next != null){
                System.out.print("->");
            }
            temp = temp.next;
        }
    }
    public void deleteFirst() {
		if (head != null) {
            head = head.next;
        }
    }
    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    // 2. public void display()
    // 3. public void deleteFirst()



    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.display();
        System.out.println();
        System.out.println("do dai la: "+linkedList.length());
        System.out.println("xoa phan tu dau va them vao index 1 la 9");
        linkedList.deleteFirst();
        linkedList.add(9, 1);
        linkedList.display();
        System.out.println();
        System.out.println("them 3 phan tu vao duoi");
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.display();
        System.out.println();
        System.out.println("do dai la: "+linkedList.length());
    }
}
