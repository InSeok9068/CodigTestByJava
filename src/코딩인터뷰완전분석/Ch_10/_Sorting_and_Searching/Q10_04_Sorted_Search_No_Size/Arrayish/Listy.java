package 코딩인터뷰완전분석.Ch_10._Sorting_and_Searching.Q10_04_Sorted_Search_No_Size.Arrayish;

public class Listy {
    int[] array;

    public Listy(int[] arr) {
        array = arr.clone();
    }

    public int elementAt(int index) {
        if (index >= array.length) {
            return -1;
        }
        return array[index];
    }
}
