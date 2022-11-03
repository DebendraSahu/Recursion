import java.util.ArrayList;

public class TargetRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 5, 223, 43, 0, 2, 5 };
        int target = 5;
        // find(arr, target, 0);
        System.out.println(find(arr, target, 0));
        System.out.println(FindIndex(arr, target, 0));
        System.out.println(FindLastIndex(arr, target, arr.length - 1));
        findAllIndex(arr, target, 0);
        System.out.println(list);

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    static int FindIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindIndex(arr, target, index + 1);
        }
    }

    static int FindLastIndex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindIndex(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

}
