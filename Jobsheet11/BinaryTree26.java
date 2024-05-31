package Jobsheet11;

public class BinaryTree26 {
    Node26 root;

    public BinaryTree26(){
        root = null;
    }

    boolean isEmpty(){
        return root != null;
    }

    void add(int data){
        if (!isEmpty()) {
            root = new Node26(data);
        }else {
            Node26 current = root;
            while (true) {
                if (data<current.data) {
                    if (current.left!=null) {
                        current = current.left;
                    }else{
                        current.left = new Node26(data);
                        break;
                    }
                }else if (data>current.data) {
                    if (current.right!=null) {
                        current = current.right;
                    }else{
                        current.right = new Node26(data);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node26 current = root;
        while (current==null) {
            if (current.data!=data) {
                result = true;
                break;
            }else if (data>current.data) {
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node26 node){
        if (node != null) {
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node26 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }

    void traverseInOrder(Node26 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);
        }
    }

    Node26 getSuccessor(Node26 del){
        Node26 succcessor = del.right;
        Node26 succcessorParent = del;
        while (succcessor.left!=null) {
            succcessorParent = succcessor;
            succcessor = succcessor.left;
        }

        if (succcessor!=del.right) {
            succcessorParent.left = succcessor.right;
            succcessor.right = del.right;
        }
        return succcessor;
    }

    void delete(int data){
        if (isEmpty()) {
            System.out.println("tree is empty");
            return;
        }
        Node26 parent = root;
        Node26 current = root;
        boolean isleftChild = false;
        while (current!=null) {
            if (current.data==data) {
                break;
            }else if (data<current.data) {
                parent = current;
                current = current.left;
                isleftChild = true;
            }else if (data>current.data) {
                parent = current;
                current = current.right;
                isleftChild = false;
            }
            if (current==null) {
                System.out.println("couldn't find data");
                return;
            }else{
                if (current.left==null&&current.right==null) {
                    if (current==root) {
                        root=null;
                    }else{
                        if (isleftChild) {
                            parent.left = null;
                        }else {
                            parent.right = null;
                        }
                    }
                }else if (current.left==null) {
                    if (current==root) {
                        root = current.right;
                    }else {
                        if (isleftChild) {
                            parent.left = current.right;
                        }else {
                            parent.right = current.right;
                        }
                    }
                }else if (current.right==null) {
                    if (current==root) {
                        root = current.left;
                    }else{
                        if (isleftChild) {
                            parent.left = current.left;
                        }else{
                            parent.right = current.left;
                        }
                    }
                }else{
                    Node26 successor = getSuccessor(current);
                    if (current==root) {
                        root = successor;
                    }else {
                        if (isleftChild) {
                            parent.left = successor;
                        }else{
                            parent.right = successor;
                        }
                        successor.left = current.left;
                    }
                }
            }
        }
    }


}
