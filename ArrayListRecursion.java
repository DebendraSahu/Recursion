import java.util.ArrayList;

public class ArrayListRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 3, 9, 22, 54, 9, 324 };
        int target = 9;
        System.out.println(FindAllIndex(arr, target, 0, new ArrayList<>()));
    }

    static ArrayList<Integer> FindAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        return FindAllIndex(arr, target, index + 1, list);
    }

}
