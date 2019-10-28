package twoList;

public class Main {
    public static void main(String[] args) {
        List<String> list =new List<>();
        list.add("2");
        list.add("aee");
        list.add("hi");
        list.delete(0);
        list.takeFromBegin();
        list.takeFromEnd();

    }

}
