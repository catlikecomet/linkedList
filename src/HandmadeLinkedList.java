
public class HandmadeLinkedList {
    Node firstNode;
    Node nextNode;

    public void setCurrentNode(String value) {
        Node node = new Node();
        node.value = value;
        node.nextNode = null;

        if (firstNode == null) {
            firstNode = node;
        } else {
            firstNode.getLast();
        }
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public Node setNextNode(Node node) {
        return node.nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public Node getLastNode() {
        return firstNode.getLast();
    }

    public void addNode(String value) {
        Node addNode = new Node();
        addNode.value = value;
        addNode.nextNode = null;

        Node lastNode = getLastNode();
        lastNode.nextNode = addNode;
    }

    public boolean contains(String value) {
        return firstNode.nodeContains(value);
    }

    public void deleteNode(int index) {
        int count = 0;
        Node node = firstNode;


        if (node.nextNode != null) {
            count++;
        }

        if (index - 1 == count) {
            nextNode  = nextNode.nextNode;

        }
    }

    public String[] fullLinkedList() {
        String[] list = new String[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = ;
        }
        return list;
    }
}

class Node {
    String value;
    Node nextNode;

    Node getLast() {
        if (nextNode == null) {
            return this;
        }
        return nextNode.getLast();
    }

    boolean nodeContains(String value) {
        if (this.value .equals(value)) {
            return true;
        }

        if (nextNode== null) {
            return false;
        }

        return nextNode.nodeContains(value);
    }

    public void setNextNode (Node node) {
        this.nextNode = node;
    }

}