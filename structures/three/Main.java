package three;

public class Main {
    public static void main(String[] args) {
        Three<Integer> t = new Three<>();
        Node<Integer> node = null;
        node=t.add(node,100);
        node=t.add(node,50);
        node=t.add(node,25);
        node=t.add(node,75);
        node=t.add(node,150);
        node=t.add(node,125);
        node=t.add(node,175);
        node=t.add(node,50);

        //node=t.delete(node, 100);

        t.show(node, 0);
    }
}
