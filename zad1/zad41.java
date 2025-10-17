public class zad41 {
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(findFirst(arr, 2));  // 1
        System.out.println(findFirst(arr, 5));  // 6
        System.out.println(findFirst(arr, 9));  // -1
        System.out.println(findFirst(new int[]{}, 1)); // -1 (пустой массив)
    }
}
