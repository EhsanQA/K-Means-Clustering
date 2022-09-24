import java.util.LinkedList;
import java.lang.Math;
import java.util.Random;

public class KMeansClustering {
    public static int K = 2;

    public static void cluster (LinkedList<Integer> list) {
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int index1 = rand.nextInt(list.size());
            int index2 = rand.nextInt(list.size());
            int one = list.get(index1);
            int two = list.get(index2);
            LinkedList<Integer> D = new LinkedList<>();
            // LinkedList<Integer> twos = new LinkedList<>();
            System.out.println(one);
            System.out.println(two);

            for (int j = 0; j < list.size(); j++) {
                if (Math.abs(list.get(j) - one) < Math.abs(list.get(j) - two)) {
                    D.add(0);
                } else D.add(1);
            }
            for (int j = 0; j < D.size(); j++)
                System.out.println(D.get(j));
            System.out.println("DONE");
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> input = new LinkedList<>();
        input.add(1);
        input.add(5);
        input.add(7);
        input.add(70);
        input.add(100);
        input.add(150);
        input.add(200);
        cluster(input);

    }

}
