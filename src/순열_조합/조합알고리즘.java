package 순열_조합;

public class 조합알고리즘 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        //조합 (순서 관심 없고 뽑은 유무만 생각)
        System.out.println("\n조합");
        for (int i = 1; i <= n; i++) {
            int[] comArr = new int[i];
            combination(comArr, n, i, 0, 0, arr);
        }

    }

    //조합 (순서 관심 없고 뽑은 유무만 생각)
    private static void combination(int[] comArr, int n, int r, int index, int target, int[] arr) {
        if (r == 0) {
            for (int i : comArr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        if (target == n) {
            return;
        }

        comArr[index] = arr[target];
        combination(comArr, n, r - 1, index + 1, target + 1, arr); //뽑는 경우
        combination(comArr, n, r, index, target + 1, arr); //안 뽑는 경우
    }
}
