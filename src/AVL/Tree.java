package AVL;

/**
 * Created by abdul on 11/13/16.
 */
public class Tree {

    Node root;

    public Tree(Node node) {
        root = node;
    }

    public void addNode(Node newNode) {

        Node copyNewNode = newNode;
        Node copyRoot = root;
        Node parentNode = null;
        boolean insertRight = true;
        boolean rootSelection;

        if (root.number < newNode.number) {
            rootSelection = true;
        } else {
            rootSelection = false;
        }

        while (copyRoot != null) {
            if (copyRoot.number < newNode.number) {

                parentNode = copyRoot;
                copyRoot = copyRoot.rightNode;
                insertRight = true;
            } else if (copyRoot.number > newNode.number) {

                parentNode = copyRoot;
                copyRoot = copyRoot.leftNode;
                insertRight = false;
            }
        }


        /**
         * If the new child is to be inserted at the right position of the
         * parent node then this condition executes.
         */
        if (insertRight) {

            parentNode.rightNode = newNode;
            parentNode.rightNode.parentNode = parentNode;

            /**
             * Calculating the height of each node and if the balance factor of
             * any node is greater then 1 then it balances the node by calling
             * different methods.
             */
            while (parentNode != null) {

                if (parentNode.rightNode != null) {

                    if (parentNode.rightNode.leftTreeHeight >= parentNode.rightNode.rightTreeHeight) {
                        parentNode.rightTreeHeight = parentNode.rightNode.leftTreeHeight + 1;
                    } else {
                        parentNode.rightTreeHeight = parentNode.rightNode.rightTreeHeight + 1;
                    }
                }

                if (parentNode.leftNode != null) {

                    if (parentNode.leftNode.leftTreeHeight >= parentNode.leftNode.rightTreeHeight) {
                        parentNode.leftTreeHeight = parentNode.leftNode.leftTreeHeight + 1;
                    } else {
                        parentNode.leftTreeHeight = parentNode.leftNode.rightTreeHeight + 1;
                    }
                }

                if (Math.abs(parentNode.rightTreeHeight - parentNode.leftTreeHeight) > 1) {

                    System.out.println(parentNode.number);
                    Node copyParent = parentNode;
                    int num = 0;
                    while (copyParent != copyNewNode.parentNode) {

                        if (copyParent.rightTreeHeight > copyParent.leftTreeHeight) {
                            copyParent = copyParent.rightNode;
                            num++;
                        } else {
                            copyParent = copyParent.leftNode;
                            num--;
                        }
                    }

                    if (num == 0) {

                        if(parentNode.rightTreeHeight > parentNode.leftTreeHeight) {
                            right_Left_Rotation(parentNode);
                            break;
                        }else{
                            left_Right_Rotation(parentNode);
                            break;
                        }

                    } else if (num >= 1) {
                        right_Right_Rotation(parentNode);
                        break;

                    }else if(num == -1){
                        left_Right_Rotation(parentNode);
                        break;
                    }else if(num < -1){
                        left_Left_Rotation(parentNode);
                        break;
                    }

                } else {
                    parentNode = parentNode.parentNode;
                }
            }

            /**
             * If the new child is to be inserted at the left position of the
             * parent node then this condition executes.
             */
        } else if (!insertRight) {

            parentNode.leftNode = newNode;
            parentNode.leftNode.parentNode = parentNode;

            /**
             * Calculating the height of each node and if the balance factor of
             * any node is greater then 1 then it balances the node by calling
             * different methods.
             */
            while (parentNode != null) {

                if (parentNode.rightNode != null) {

                    if (parentNode.rightNode.leftTreeHeight > parentNode.rightNode.rightTreeHeight) {
                        parentNode.rightTreeHeight = parentNode.rightNode.leftTreeHeight + 1;
                    } else {
                        parentNode.rightTreeHeight = parentNode.rightNode.rightTreeHeight + 1;
                    }
                }

                if (parentNode.leftNode != null) {

                    if (parentNode.leftNode.leftTreeHeight >= parentNode.leftNode.rightTreeHeight) {
                        parentNode.leftTreeHeight = parentNode.leftNode.leftTreeHeight + 1;
                    } else {
                        parentNode.leftTreeHeight = parentNode.leftNode.rightTreeHeight + 1;
                    }
                }

                if (Math.abs(parentNode.rightTreeHeight - parentNode.leftTreeHeight) > 1) {

                    Node copyParent = parentNode;
                    int num = 0;
                    while (copyParent != copyNewNode.parentNode) {

                        if (copyParent.leftTreeHeight > copyParent.rightTreeHeight) {
                            copyParent = copyParent.leftNode;
                            num++;
                        } else {
                            copyParent = copyParent.rightNode;
                            num--;
                        }
                    }

                    if(num == -1){
                        right_Left_Rotation(parentNode);
                        break;

                    } else if (num >= 1) {
                        left_Left_Rotation(parentNode);
                        break;

                    }else if(num == 0){

                        //Some Changes Here
                        if(parentNode.rightTreeHeight > parentNode.leftTreeHeight) {
                            right_Left_Rotation(parentNode);
                            break;
                        }
                        else {
                            left_Right_Rotation(parentNode);
                            break;
                        }

                    }else if(num < -1){
                        right_Right_Rotation(parentNode);
                        break;
                    }

                } else {
                    parentNode = parentNode.parentNode;
                }

            }

        }
    }


    public void right_Right_Rotation(Node unBalanceNode){

        Node grandParent = unBalanceNode.parentNode;
        Node child = unBalanceNode.rightNode;
        Node childLeftNode = child.leftNode;

        boolean left = false;
        if(unBalanceNode != null){
            left = unBalanceNode.leftNode == unBalanceNode;
        }

        child.leftNode = unBalanceNode;
        unBalanceNode.rightNode = childLeftNode;

        unBalanceNode.parentNode = child;
        if(childLeftNode != null)
            childLeftNode.parentNode = unBalanceNode;

        if(grandParent == null){
            this.root = child;
            child.parentNode = null;
        }else if(!left){
            grandParent.rightNode = child;
            child.parentNode = grandParent;
        }else{
            grandParent.leftNode = child;
            child.parentNode = grandParent;
        }

        /**
         * Setting the length of the swapped nodes.
         */
        if (unBalanceNode.rightNode != null) {
            if(unBalanceNode.rightNode.rightTreeHeight > unBalanceNode.rightNode.leftTreeHeight) {
                unBalanceNode.rightTreeHeight = unBalanceNode.rightNode.rightTreeHeight + 1;
            }else{
                unBalanceNode.rightTreeHeight = unBalanceNode.rightNode.leftTreeHeight + 1;
            }
        } else {
            unBalanceNode.rightTreeHeight = 0;
        }

        if (unBalanceNode.leftNode != null) {

            if(unBalanceNode.leftNode.rightTreeHeight > unBalanceNode.leftNode.leftTreeHeight) {
                unBalanceNode.leftTreeHeight = unBalanceNode.leftNode.rightTreeHeight + 1;
            }else{
                unBalanceNode.leftTreeHeight = unBalanceNode.leftNode.leftTreeHeight + 1;
            }

        } else {
            unBalanceNode.leftTreeHeight = 0;
        }



        if (child.rightNode != null) {

            if(child.rightNode.rightTreeHeight > child.rightNode.leftTreeHeight) {
                child.rightTreeHeight = child.rightNode.rightTreeHeight + 1;
            }else{
                child.rightTreeHeight = child.rightNode.leftTreeHeight + 1;
            }

        } else {
            child.rightTreeHeight = 0;
        }

        if (child.leftNode != null) {

            if(child.leftNode.rightTreeHeight > child.leftNode.leftTreeHeight) {
                child.leftTreeHeight = child.leftNode.rightTreeHeight + 1;
            }else{
                child.leftTreeHeight = child.leftNode.leftTreeHeight + 1;
            }
        } else {
            child.leftTreeHeight = 0;
        }
    }

    public void right_Left_Rotation(Node unBalanceNode){

        Node grandParent = unBalanceNode.parentNode;
        Node child = unBalanceNode.rightNode;
        Node sub_Child = child.leftNode;
        Node subChild_Child_RightNode = null;
        subChild_Child_RightNode = sub_Child.rightNode;


        unBalanceNode.rightNode = sub_Child;
        sub_Child.parentNode = unBalanceNode;

        sub_Child.rightNode = child;
        child.parentNode = sub_Child;


        child.leftNode = subChild_Child_RightNode;

        if(subChild_Child_RightNode == null){
            child.leftTreeHeight = 0;
        }else{

            if(subChild_Child_RightNode.rightTreeHeight > subChild_Child_RightNode.leftTreeHeight) {
                child.leftTreeHeight = subChild_Child_RightNode.rightTreeHeight + 1;
            }else {
                child.leftTreeHeight = subChild_Child_RightNode.leftTreeHeight + 1;
            }
        }

        if(subChild_Child_RightNode != null) {
            subChild_Child_RightNode.parentNode = child;
        }

        right_Right_Rotation(unBalanceNode);
    }


    public void left_Left_Rotation(Node unBalanceNode){

        Node grandParent = unBalanceNode.parentNode;
        Node childNode = unBalanceNode.leftNode;

        Node childRightNode = childNode.rightNode;

        boolean right = false;
        if(grandParent != null){
            right = grandParent.rightNode == unBalanceNode;
        }

        childNode.rightNode = unBalanceNode;
        unBalanceNode.parentNode = childNode;
        unBalanceNode.leftNode = childRightNode;

        if(childRightNode != null) {
            childRightNode.parentNode = unBalanceNode;
        }

        if(grandParent == null){
            this.root = childNode;
            childNode.parentNode = null;
        }else if(!right){
            grandParent.leftNode = childNode;
            childNode.parentNode = grandParent;
        }else {
            grandParent.rightNode = childNode;
            childNode.parentNode = grandParent;
        }

        /**
         * Setting the length of the swapped nodes.
         */
        if (unBalanceNode.rightNode != null) {
            if(unBalanceNode.rightNode.rightTreeHeight > unBalanceNode.rightNode.leftTreeHeight) {
                unBalanceNode.rightTreeHeight = unBalanceNode.rightNode.rightTreeHeight + 1;
            }else{
                unBalanceNode.rightTreeHeight = unBalanceNode.rightNode.leftTreeHeight + 1;
            }
        } else {
            unBalanceNode.rightTreeHeight = 0;
        }

        if (unBalanceNode.leftNode != null) {

            if(unBalanceNode.leftNode.rightTreeHeight > unBalanceNode.leftNode.leftTreeHeight) {
                unBalanceNode.leftTreeHeight = unBalanceNode.leftNode.rightTreeHeight + 1;
            }else{
                unBalanceNode.leftTreeHeight = unBalanceNode.leftNode.leftTreeHeight + 1;
            }

        } else {
            unBalanceNode.leftTreeHeight = 0;
        }



        if (childNode.rightNode != null) {

            if(childNode.rightNode.rightTreeHeight > childNode.rightNode.leftTreeHeight) {
                childNode.rightTreeHeight = childNode.rightNode.rightTreeHeight + 1;
            }else{
                childNode.rightTreeHeight = childNode.rightNode.leftTreeHeight + 1;
            }

        } else {
            childNode.rightTreeHeight = 0;
        }

        if (childNode.leftNode != null) {

            if(childNode.leftNode.rightTreeHeight > childNode.leftNode.leftTreeHeight) {
                childNode.leftTreeHeight = childNode.leftNode.rightTreeHeight + 1;
            }else{
                childNode.leftTreeHeight = childNode.leftNode.leftTreeHeight + 1;
            }
        } else {
            childNode.leftTreeHeight = 0;
        }
    }

    public void left_Right_Rotation(Node unBalanceNode){

        Node grandParent = unBalanceNode.parentNode;
        Node child = unBalanceNode.leftNode;
        Node subChild = child.rightNode;
        //Node subChild_Child = null;
        Node subChild_Child_LeftNode = null;


        if(subChild.leftNode != null)
            subChild_Child_LeftNode = subChild.leftNode;

        unBalanceNode.leftNode = subChild;
        subChild.parentNode = unBalanceNode;

        subChild.leftNode = child;
        child.parentNode = subChild;

        child.rightNode = subChild_Child_LeftNode;

        if(subChild_Child_LeftNode == null){
            child.rightTreeHeight = 0;
        }else{

            if(subChild_Child_LeftNode.rightTreeHeight > subChild_Child_LeftNode.leftTreeHeight) {
                child.rightTreeHeight = subChild_Child_LeftNode.rightTreeHeight + 1;
            }else {
                child.rightTreeHeight = subChild_Child_LeftNode.leftTreeHeight + 1;
            }
        }

        if(subChild_Child_LeftNode != null) {
            subChild_Child_LeftNode.parentNode = child;
        }

        left_Left_Rotation(unBalanceNode);
    }



    public void display() {
        print(root, null);
    }

    public Node print(Node root, Node parent) {

        if (root == null) {
            return parent;
        } else {
            print(root.leftNode, root);
            if (root.parentNode != null) {
                System.out.println(root.number + "  RTH: " + root.rightTreeHeight + "     " + "LTH: " + root.leftTreeHeight
                        + "    parent:   " + root.parentNode.number);
            } else {
                System.out.println(root.number + "  RTH: " + root.rightTreeHeight + "     " + "LTH: " + root.leftTreeHeight);
            }
            if (root.leftNode != null) {
                System.out.println("---->Left Child: " + root.leftNode.number);
            }
            if (root.rightNode != null) {
                System.out.println("---->Right Child: " + root.rightNode.number);
            }

            print(root.rightNode, root);
        }
        return null;
    }

}






























