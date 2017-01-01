package AVL;

/**
 * Created by abdul on 11/13/16.
 */
public class Node {

    int number;
    Node leftNode;
    Node rightNode;
    Node parentNode;
    int leftTreeHeight;
    int rightTreeHeight;

    public Node(int number){
        this.number = number;
        parentNode = null;
        leftNode = null;
        rightNode = null;
        leftTreeHeight = 0;
        rightTreeHeight = 0;
    }

}
