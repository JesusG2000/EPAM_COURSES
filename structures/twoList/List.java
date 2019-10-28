package twoList;

public class List<T> {
   private Node Head, End;
   private int size;

    public List() {
        Head = null;
        End = null;
        size = 0;
    }

    public void add(T x) {
        Node elem = new Node();
        elem.next = null;
        elem.value = x;
        size++;
        if (Head != null) {
            elem.prev = End;
            End.next = elem;
            End = elem;
        } else {
            elem.prev = null;
            Head = End = elem;
        }
    }
    public void delete(int index){
        if (index == 0 && Head.next!=null) {
            Node elem = Head;
            Head = Head.next;
            Head.prev =null;
            size--;

        }
        else if (index == 0 && Head==End) {
            Node elem = Head;
            Head.next = null;
            Head = null;
            size =0;

        }
        else if (index == size -1) {
            Node elem = End;
            End = End.prev;
            End.next = null;
            size--;

        }
        else {

            Node elem = Head;
            for (int i = 0; i < index; i++) {
                elem = elem.next;

            }
            elem.next.prev = elem.prev;
            elem.prev.next = elem.next;
            size--;
        }
    }
    public void takeFromBegin(){
        Node elem = Head;
        while (elem!=null) {
            System.out.println(elem.value);
            elem = elem.next;
        }

    }
    public void takeFromEnd(){
        Node elem = End;
        while (elem!=null) {
            System.out.println(elem.value);
            elem = elem.prev;
        }

    }
}
