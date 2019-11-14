public class Main {
    public static void main(String[] args) {
        System.out.println("TEST");
        MyLinkenList aa = new MyLinkenList(9);
        aa.addFirst(12);
        aa.addFirst(13);
        aa.addFirst(17);

        aa.add(4,9);
        aa.add(4,8);
        aa.printList();
    }
}
