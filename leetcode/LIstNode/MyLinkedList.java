package leetcode.LIstNode;

/**
 * @author Zonda
 * @version 1.0
 * @Date 2024/8/1417:19
 * @description
 **/
class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0,10);
        myLinkedList.addAtIndex(0,20);
        myLinkedList.addAtIndex(1,30);
        myLinkedList.get(0);
    }
    int nodeNum;
    Node head;
    public MyLinkedList() {
        nodeNum = 0;
    }

    public int get(int index) {
        if(nodeNum == 0) return -1;
        else if(index >= nodeNum) return -1;
        else{
            int res = head.val;
            Node cur = head;
            for(int i = 0;i < index;i++){
                cur = cur.next;
            }
            res = cur.val;
            return res;
        }
    }

    public void addAtHead(int val) {
        if(nodeNum == 0) head = new Node(val);
        else{
            Node node = new Node(val);
            node.next = head;
            head = node;
        }
        nodeNum++;
    }

    public void addAtTail(int val) {
        if(nodeNum == 0) head = new Node(val);
        else{
            Node node = new Node(val);
            Node cur = head;
            for(int i = 1;i < nodeNum;i++){
                cur = cur.next;
            }
            cur.next = node;
        }
        nodeNum++;
    }

    public void addAtIndex(int index, int val) {
        if(index > nodeNum) return;
        else if(index == 0){
            addAtHead(val);
            return;
        }
        else{
            Node node = new Node(val);
            Node cur = new Node();
            cur.next = head;
            for(int i = 0;i < index;i++){
                cur = cur.next;
            }
            Node temp = cur.next;
            cur.next = node;
            node.next = temp;
        }
        nodeNum++;
    }

    public void deleteAtIndex(int index) {
        if(nodeNum == 0 || index >= nodeNum) return;
        else{
            if(index == 0){
                head = head.next;
            }else{
                Node cur = new Node();
                cur.next = head;
                for(int i = 0;i < index;i++){
                    cur = cur.next;
                }
                cur.next = cur.next.next;
            }
        }
        nodeNum--;
    }
}
class Node{
    int val;
    Node next;
    Node(){

    }
    Node(int val){
        this.val = val;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
