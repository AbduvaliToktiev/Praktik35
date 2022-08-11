import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        Random random = new Random();

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("pineapple");
        for (int i = 0; i < 10; i++) {
            String fruit = list.get(random.nextInt(list.size()));
            if (!map.containsValue(fruit)) {
                map.put(i, fruit);
            }
        }

        System.out.println(map);

        Set<Integer> integers = map.keySet();
        Integer delete = null;
        for (Integer integer: integers) {
            delete = map.get(integer).equals("apple") ? integer : delete;
            if (delete != null) {
                map.remove(delete);
            }
        }
        System.out.println(map);
    }
}
