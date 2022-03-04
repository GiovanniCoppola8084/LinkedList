public class NodeExample {
    // Create a head node
    private Node head;

    /**
     * Add a node to the end of the linked list
     * @param data - the data that will be put in the node
     */
    public void AddNodeToEnd(String data) {
        Node current = head;

        if (head == null) {
            head = new Node(data);
        }

        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    /**
     * Add a node to the start of the linked list
     * @param data - the data that will be put in the node
     */
    public void AddNodeToStart(String data) {
        Node current = new Node(data);
        current.next = head;
        head = current;
    }

    /**
     * Print the nodes of the linked list in order
     */
    public void PrintNodes() {
        Node current = head;

        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        NodeExample newNode = new NodeExample();

        newNode.AddNodeToEnd("Poogers");
        newNode.AddNodeToEnd("Nugget");
        newNode.AddNodeToEnd("Ditto");
        newNode.AddNodeToEnd("Boober");

        newNode.PrintNodes();
    }
}
