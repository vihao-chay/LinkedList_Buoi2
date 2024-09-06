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
        System.out.println();
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
		if (head == null) {
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next == null){
            deleteFirst();
            return;
        }
        Node temp = head;
        Node previous =null;
        while(temp.next != null){
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
    }

    public void delete(int index){
        if(index ==0){
            deleteFirst();
            return;
        }else if(index == length()-1){
            deleteLast();
            return;
        }else{
            Node preNodeDelete = head;
            for(int i=1;i<index;i++){
                preNodeDelete = preNodeDelete.next;
            }
            preNodeDelete.next = preNodeDelete.next.next;
        }
    }

    public boolean search(int data){
        if(head ==null){
            return false;
        }
        Node temp =head;
        while(temp != null){
            if(temp.getData() == data)
                return true;
        }
        return false;
    }
    public Node searchAtPosition(int index){
        if(index <0 || index >length()){
            return null;
        }
        Node temp = head;
        for(int i=0;i<=index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void deleteCount(int index){
        if(index ==0){
            deleteFirst();
            return;
        }else if(index == length()-1){
            deleteLast();
            return;
        }else{
            Node preNodeDelete = head;
            int count=0;
            while(count < index -1 ){
                preNodeDelete = preNodeDelete.next;
                count++;
            }
            preNodeDelete.next = preNodeDelete.next.next;
        }
    }
    public void sort() {
        if (head == null) {
            return;
        }
    boolean flag;
        do {
            Node temp = head;
            flag =false;
            while (temp.next != null) {
                if (temp.getData() > temp.next.getData()) {
                    int n =temp.getData();
                    temp.setData(temp.next.getData());
                    temp.next.setData(n);
                    flag= true; 
                }
                temp = temp.next;
            }
        } while (flag); 
    }
    
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(10);
        linkedList.addFirst(3);
        //3-10-1
        linkedList.display();
        System.out.println();
        System.out.println("do dai la: "+linkedList.length());
        System.out.print("xoa phan tu dau");
        linkedList.deleteFirst();
        linkedList.display();
        System.out.println();
        System.out.print("them 3 phan tu vao duoi");
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        //10-1-4-5-6
        linkedList.display();
        System.out.println();
        System.out.print("do dai la: "+linkedList.length());
        System.out.println();
        System.out.print("xoa phan tu o index = 3");
        linkedList.deleteCount(3);
        //10-1-4-6
        linkedList.display();
        System.out.println();
        System.out.print("sau khi sap xep");
        linkedList.sort();
        //1-4-6-10
        linkedList.display();

    }
}
