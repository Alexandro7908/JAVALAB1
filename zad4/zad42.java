public class zad42 {
    public static int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(findLast(arr, 2));  // 5
        System.out.println(findLast(arr, 1));  // 0
        System.out.println(findLast(arr, 5));  // 6
        System.out.println(findLast(arr, 9));  // -1
        System.out.println(findLast(new int[]{}, 1)); // -1 (пустой массив)
    }
}
