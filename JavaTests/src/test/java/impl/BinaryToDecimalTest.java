package impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryToDecimalTest {
    private BinaryToDecimal binaryToDecimal;

    @BeforeEach
    public void initSetUp() {
        this.binaryToDecimal = new BinaryToDecimal();
    }

    @Test
    public void test1() {
        final SinglyLinkedListNode node = this.getNode(new int[] {1, 0, 1, 0});
        Assertions.assertEquals(10, this.binaryToDecimal.solution(node));
    }

    private SinglyLinkedListNode getNode(final int[] binary) {

        SinglyLinkedListNode next = new SinglyLinkedListNode(binary[binary.length - 1]);
        SinglyLinkedListNode node = null;
        for (int i = binary.length - 2; i >= 0; i--) {
            node = new SinglyLinkedListNode(binary[i]);
            node.next = next;

            next = node;
        }

        return node;
    }
}
