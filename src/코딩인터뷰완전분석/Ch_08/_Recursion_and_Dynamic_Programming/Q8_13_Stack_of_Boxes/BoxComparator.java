package 코딩인터뷰완전분석.Ch_08._Recursion_and_Dynamic_Programming.Q8_13_Stack_of_Boxes;

import java.util.Comparator;

public class BoxComparator implements Comparator<Box> {
    @Override
    public int compare(Box x, Box y) {
        return y.height - x.height;
    }
}
