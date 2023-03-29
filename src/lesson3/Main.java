package lesson3;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Hello World!");
        System.out.println(list.get(0)); //Hello World!
//        System.out.println(list.get(-1)); //ERROR: Index -1 not correct!
        list.add("New Hello World!");
        list.remove(0);
        System.out.println(list.contains("Hello World!")); //false
    }
}
