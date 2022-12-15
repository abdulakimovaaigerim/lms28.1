import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1,20));
            if(list.get(i)%2==0){
                list1.add(list.get(i)*list.get(i));
            }
        }
        System.out.println("The largest square: " +list1.stream().sorted().max(Integer::compareTo).get());

    }
}