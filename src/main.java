public class main {

    public static void main (String[] args) {

        HandmadeLinkedList linkedList = new HandmadeLinkedList();
        linkedList.setCurrentNode("hello");
        System.out.println(linkedList.getLastNode().value);

        linkedList.addNode("idonotlikethislinkedlist");
        System.out.println(linkedList.getLastNode().value);

        linkedList.addNode("ebkekjewfcqer");

        System.out.println(linkedList.contains("idonotlikethislinkedlist"));
        System.out.println(linkedList.contains("khbibljhbvblub"));


        linkedList.deleteNode(1);
        System.out.println(linkedList.getNextNode());

        linkedList.fullLinkedList()
    }
}
