public class BinarySearchTree {

    Node root; // root of BST

    // insert: if new entry, insert in tree
    public void insert(String d) {
        if (root == null) {
            root = new Node(d);
            return;
        }

        Node loc = root; // start search downward at root
        while (true) {
            if (d.compareTo(loc.data) < 0) // look left
            {
                if (loc.left != null) {
                    loc = loc.left;
                } else {
                    loc.left = new Node(d);
                    break;
                }
            } else if (d.compareTo(loc.data) > 0) //look right
            {
                if (loc.right != null) {
                    loc = loc.right;
                } else {
                    loc.right = new Node(d);
                    break;
                }
            } else //do not insert
            {
                break;
            }
        }
    }

    public void inorderTraversal() {
        inorderT(root);
    }

    // recursive inorder traversal
    private void inorderT(Node T) {
        if (T != null) {
            inorderT(T.left);
            System.out.println(T.data);
            inorderT(T.right);
        }
    }

    public void preorderTraversal() {
        preorderT(root);
    }

    private void preorderT(Node T) {
        if (T != null) {
            System.out.println(T.data);
            preorderT(T.left);
            preorderT(T.right);
        }
    }

    public void postorderTraversal()
    {
        postorderT(root);
    }

    private void postorderT(Node T)
    {
        if(T != null)
        {
            postorderT(T.left);
            postorderT(T.right);
            System.out.println(T.data);
        }
    }
}
