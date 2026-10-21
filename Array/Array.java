public class Array {
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40, 50, 60 };

        int arr[] = new int[6];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
