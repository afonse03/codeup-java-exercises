// 9/20/21
/*
first mini exercise
Create a class called CollectionsTest and include the following...
    TODO: create a static method, omit2s, that takes in an array list of integers.
      The method should return an arraylist of integers with the same values as the
      input arraylist but without 2s.
 */

package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CollectionsTest {
    public static ArrayList<Integer> omit2s(ArrayList<Integer> integers) {
        integers.removeAll(Arrays.asList(2));
        return integers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers);
        System.out.println(omit2s(numbers));
    }


/*
second mini exercise 9/20/21
    TODO: create a static method, createMap, that takes in two arraylists. The method should
      return a hashmap where the keys are the elements of the first passed arraylist and are
      connected to values of the second arraylist. Assume both input arraylists are lists of
      strings. Assume the lengths of both input arraylists are the same

      EXAMPLE:

        List<String> keys = new ArrayList<>(Arrays.asList(
            "first key",
            "second key",
            "third key",
            "fourth key"
        ));

        List<String> values = new ArrayList<>(Arrays.asList(
            "first value",
            "second value",
            "third value",
            "fourth value"
        ));

        {"first key": "first value", "second key": "second value"}

 */
//    public static HashMap<String, String> createMap(List<String> first, List<String> second) {
//        HashMap<String, String> createdHashMap = new HashMap<>();
//        for (int i = 0; i < first.size(); i++) {
//            createdHashMap.put(first.get(i), second.get(i));
//            System.out.println(createdHashMap);
//        }
//        return createdHashMap;
//    }







}

