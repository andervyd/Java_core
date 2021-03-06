package by.andervyd._1_procedural.dds.node;

public class ExToString {
    public static void main(String[] args) {

        Node tail = Node.genRec(0, 1, 2, 3);

        System.out.println(Node.toStringIter(tail));
        // >> 0 -> 1 -> 2 -> 3 -> *

        System.out.println("===========");

        System.out.println(Node.toStringRec(tail));
        // >> 0 -> 1 -> 2 -> 3 -> *
    }
}
