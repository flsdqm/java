package Task4;

public class MyLinkedList {
    private Node first;//首节点
    private Node last;//尾节点
    private int size;//链表大小

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public void add(Object obj) {
        Node node = new Node(null, null, null);
        if (first == null) {//first==null,LinkedList中没有一个节点
            node.data = obj;
            first = node;
            last = node;//第一个节点和最后一个节点都是node
            size++;
        } else {
            node.data = obj;
            last.next = node;//和最后一个连接起来
            node.previous = last;//双向连接
            last = node;//当前节点变为末尾节点,往后移一个
            size++;
        }
    }

    public Node get(int index) {
        RangeCheck(index);//要保证index在链表大小范围内。
        Node temp = null;
        if(index < (size>>1)){//就是除以2
            temp = first;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        }else {
            temp = last;
            for(int i = size-1; i > index; i--){
                temp = temp.previous;
            }
        }
        return temp;
    }

    private void RangeCheck(int index) {
        if(index < 0||index >= size){
            throw new IndexOutOfBoundsException("IndexOutOfBounds" + index);//不合法则抛出异常
        }
    }

    public void insert(int index,Object obj) {
        RangeCheck(index);//要保证index在链表大小范围内。
        Node node = new Node(null,null,null);//node是新加入的
        node.data = obj;
        Node node2 = first;//node2初始位第0个
        for(int i = 0; i < index-1; i++){//循环index-1轮，变为index个
            node2 = node2.next;
        }
        node.next = node2.next;//node指向后一个的链子变为node2指向后一个
        node2.next.previous = node;//node2下一个指向前一个为node
        node2.next = node;
        node.previous = node2;
        size++;
    }


    public boolean delete(Object obj) {
        Node node = first;
        if(obj == null){
            while(node != null){
                if(node.data == null){
                    removefast(node);
                    return true;
                }
                node = node.next;
            }
        }else {
            while(node != null){
                if(obj.equals(node.data)){
                    removefast(node);
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }
    private void removefast(Node node){
        node.previous.next=node.next;
        size--;
        node.data=null;
        node.previous = node.next = null;
    }

    public Object set(int index,Object obj) {
        Node node = get(index);
        Object oldObject=node.data;
        node.data = obj;
        return oldObject;
    }

}