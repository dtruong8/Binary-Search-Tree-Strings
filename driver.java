import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
public class driver {
    public static void main(String[] args)
    {
        List list = readFileInList("data.txt"); // insert data in text file into a list data structure

        BinarySearchTree tree = new BinarySearchTree(); // Binary tree object
        Iterator<String> itr = list.iterator();

        System.out.println("Original: ");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        while (itr.hasNext())
        {
            tree.insert(itr.next());
        }
        System.out.println();

        System.out.println("Preorder Traversal Using Iterator:");
        tree.preorderTraversal();
        System.out.println();

        System.out.println("Inorder Traversal Using Iterator:");
        tree.inorderTraversal();
        System.out.println();

        System.out.println("Postorder Traversal Using Iterator:");
        tree.postorderTraversal();
        System.out.println();





    }
    public static List<String> readFileInList(String fileName)
    {

        List<String> lines = Collections.emptyList();
        try
        {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }

        catch (IOException e)
        {

            e.printStackTrace();
        }
        return lines;
    }


}
