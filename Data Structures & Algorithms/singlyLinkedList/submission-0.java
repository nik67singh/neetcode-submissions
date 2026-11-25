class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }


class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        //dummy node
        this.head = new Node(-1);
        this.tail = this.head;
        
    }

    public int get(int index) {
        Node curr = head.next; //curr is a pointer
        int i = 0;
        while(curr!=null){
            if(i==index){
                return curr.value;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head.next;
        head.next = newNode;
        if(newNode.next==null){
            this.tail = newNode;
        }
    }

    public void insertTail(int val) {
        this.tail.next = new Node(val);
        this.tail = tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        Node curr = head;
        while(i<index && curr!=null){
            i+=1;
            curr = curr.next;
        }
        if(curr!=null && curr.next!=null){
            if(curr.next==this.tail){ //case if you remove the last element
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head.next;
        while(curr!=null){
            arr.add(curr.value);
            curr = curr.next;
        }
        return arr;
    }
}
