    private static void printRecursivelyNodes(Node head) {
        if(head == null){
            return;
        }
        System.out.println(head.data.getData());
        printRecursivelyNodes(head.getNextNode());
