package 코딩인터뷰완전분석.Ch_03._Stacks_and_Queues.Q3_03_Stack_of_Plates;

public class Question {
    public static void main(String[] args) {
        int capacity_per_substack = 5;
        SetOfStacks set = new SetOfStacks(capacity_per_substack);
        for (int i = 0; i < 34; i++) {
            set.push(i);
        }
        for (int i = 0; i < 35; i++) {
            System.out.println("Popped " + set.pop());
        }
    }
}
