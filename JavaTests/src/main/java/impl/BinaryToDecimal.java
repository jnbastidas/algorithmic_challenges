package impl;

public class BinaryToDecimal {
    public long solution(final SinglyLinkedListNode binary) {

        SinglyLinkedListNode node = binary;
        int posVal = -1;
        while (node != null) {
            node = node.next;
            posVal++;
        }

        node = binary;
        long rdo = 0;
        while (node != null) {
            rdo = rdo + node.data * (long)Math.pow(2, posVal);

            node = node.next;
            posVal--;
        }

        return rdo;
    }
}

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    @Override
    public String toString() {
        String rdo = "";

        SinglyLinkedListNode node = this;
        while (node != null) {
            rdo = rdo.concat(String.valueOf(node.data)).concat(" -> ");
            node = node.next;
        }

        return rdo;
    }
}
