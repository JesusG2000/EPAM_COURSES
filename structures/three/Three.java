package three;

public class Three<T extends Comparable<T>> {
   private Node<T> Head;
    Three() {
        Head = null;
    }
    public Node<T> add(Node<T> elem,T number){
        if (elem == null) {
            elem = new Node<>();
            elem.value = number;

            if (Head == null) {
                Head = elem;
            }

            elem.left = elem.right = null;
            return elem;
        }
        else {
            if (elem.value.compareTo(number)> 0) {
                if (elem.left != null) {
                    add(elem.left,number);
                }
                else {
                    elem.left = new Node<>();
                    elem.left.left = elem.left.right = null;

                    elem.left.value = number;
                    return elem;

                }
            }
            if (elem.value.compareTo(number)< 0) {
                if (elem.right != null) {
                    add(elem.right,number);
                }
                else {
                    elem.right = new Node<>();
                    elem.right.right = elem.right.left = null;

                    elem.right.value = number;
                    return elem;

                }
            }else{}
        }
        return elem;
    }
    public Node<T> delete(Node<T> node, T k) {
        boolean access = true;
        if (node == null) {

            return node;
        }
        if (node == Head && node.value.compareTo(k) == 0) {

            if (node.right == null) {
                Node<T> one = node.left;
                Node<T> save = one;
                while (one.right != null) {
                    if (one.right.right == null) {
                        save = one;
                    }
                    one = one.right;
                }
                node.value = save.right.value;
                save.right = null;

                access = false;
            } else {
                Node<T> one = node.right;
                Node<T> save = one;
                while (one.left != null) {
                    if (one.left.left == null) {
                        save = one;
                    }
                    one = one.left;
                }
                node.value = save.left.value;
                save.left = null;

                access = false;
            }

        }
        if (node.value.compareTo(k) == 0 && access) {

            Node<T> tmp;
            if (node.right == null) {
                tmp = node.left;

            } else {

                Node<T> ptr = node.right;
                if (ptr.left == null) {
                    ptr.left = node.left;
                    tmp = ptr;
                } else {

                    Node<T> pmin = ptr.left;
                    while (pmin.left != null) {
                        ptr = pmin;
                        pmin = pmin.left;
                    }

                    ptr.left = pmin.right;
                    pmin.left = node.left;
                    pmin.right = node.right;
                    tmp = pmin;
                }
            }
            return tmp;
        }
            if (node.value.compareTo(k)>0 && access) {
                node.left = delete(node.left, k);
            } else if (node.value.compareTo(k)<0 && access) {

                node.right = delete(node.right, k);
            }
            return node;

    }
    public void show(Node<T> elem,int u){
        if (elem == null)
            return;
        else
        {
            show(elem.right, ++u);
            for (int i = 0; i < u; ++i) {
                System.out.print("|");
            }

            System.out.println(elem.value);
            u--;
        }
        show(elem.left, ++u);
    }
}
