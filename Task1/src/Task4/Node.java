package Task4;

public class Node {//节点

    Node previous;//前继，指向前一个Node
    Object data;//节点数据
    Node next;//后继，指向后一个Node

    public Node() {
    }

    public Node(Node previous, Object data, Node next) {
        super();
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
}
