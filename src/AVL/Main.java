package AVL;

import java.util.Random;

/**
 * Created by abdul on 11/13/16.
 */
public class Main {

    public static void main(String[] args){

        Tree tree = new Tree(new Node(3));
        tree.addNode(new Node(7));
       tree.addNode(new Node(4));
        tree.addNode(new Node(0));
        tree.addNode(new Node(9));
        tree.addNode(new Node(19));
        tree.addNode(new Node(11));
        tree.addNode(new Node(14));
        tree.addNode(new Node(1));
        tree.addNode(new Node(8));
        tree.addNode(new Node(17));

        tree.addNode(new Node(13));
        tree.addNode(new Node(6));
        tree.addNode(new Node(2));
        tree.addNode(new Node(20));
        tree.addNode(new Node(16));
        tree.addNode(new Node(27));
        tree.addNode(new Node(21));
        tree.addNode(new Node(24));

        tree.addNode(new Node(31));
        tree.addNode(new Node(22));
        tree.addNode(new Node(35));
        tree.addNode(new Node(30));
        tree.addNode(new Node(26));

        tree.addNode(new Node(28));
        tree.addNode(new Node(33));
        tree.addNode(new Node(39));
        tree.addNode(new Node(47));
        tree.addNode(new Node(34));
        tree.addNode(new Node(50));
        tree.addNode(new Node(51));
        tree.addNode(new Node(52));
        tree.addNode(new Node(53));
        tree.addNode(new Node(54));
        tree.addNode(new Node(55));
        tree.addNode(new Node(56));
        tree.addNode(new Node(57));
        tree.addNode(new Node(58));
        tree.addNode(new Node(59));
        tree.addNode(new Node(60));


        tree.display();
    }
}
