import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(15);
        treeSet.add(30);
        treeSet.add(70);
        treeSet.add(35);
        treeSet.add(21);

        System.out.println(treeSet);
        treeSet.remove(15);
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher(20));
        System.out.println(treeSet.lower(20));

        for (int i : treeSet){
            System.out.println(i + " ");
        }

    }
}
