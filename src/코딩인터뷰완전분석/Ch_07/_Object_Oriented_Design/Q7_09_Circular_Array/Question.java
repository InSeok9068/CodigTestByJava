package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_09_Circular_Array;

public class Question {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int size = 10;
        CircularArray<String> array = new CircularArray<String>(size);
        for (int i = 0; i < size; i++) {
            array.set(i, String.valueOf(i));
        }

        array.rotate(3);
        for (int i = 0; i < size; i++) {
            System.out.println(array.get(i));
        }

        System.out.println();

        array.rotate(2);
        for (String s : array) {
            System.out.println(s);
        }
    }

}
