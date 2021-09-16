package arrays;

public class FindIndex {
    private static int findExtraElementIndex(int[] arr1,int[] arr2)
    {
        for(int i=0;i<arr1.length;i++) {
            if (arr1[i] != arr2[i]) {
                return i;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        int[] arr1= {2,4,6,8,9,10,12};
        int[] arr2 = {2,4,6,8,10,12};
        int index=findExtraElementIndex(arr1,arr2);
        System.out.println(index);
    }
}
