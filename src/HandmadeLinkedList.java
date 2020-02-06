
public class HandmadeLinkedList {
    Node firstNode;

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

        if (index == count) {

        }
    }

//    public String[] fullLinkedList(String value) {
//        String[] list = new String[20];
//        list[0] = value;
//    }
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
}