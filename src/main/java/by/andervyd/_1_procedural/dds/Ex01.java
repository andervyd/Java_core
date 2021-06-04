package by.andervyd._1_procedural.dds;

public class Ex01 {
    public static void main(String[] args) {

        Node tail;

        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        node3.next = node2;
        node2.next = node1;
        node1.next = node0;

        tail = node3;

        System.out.println(tail);
        // >> Node [value: 3, next: Node [value: 2, next: Node [value: 1, next: Node [value: 0, next: null]]]]
    }
}
