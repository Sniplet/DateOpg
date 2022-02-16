
// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class ListNode {
    public memberPlayer data;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(null, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(memberPlayer data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(memberPlayer data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

