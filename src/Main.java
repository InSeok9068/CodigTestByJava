import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(solution(new int[]{1, 4, 2, 5, 3}));
//        System.out.println(solution(new int[]{3, 4, 5, 6, 7}));
        System.out.println(solution(new int[]{3, 5, 4, 2, 4, 4, 6, 5}));
//        System.out.println(solution("2019/12/01 SUN", "2019/12/31", new String[]{"12/25"}));
    }

//    public static int solution(String join_date, String resign_date, String[] holidays) {
//        List<String> holidayList = new ArrayList<>(Arrays.asList(holidays));
//        List<Integer> weekendNumber = List.of(6, 7);
//
//        LocalDate joinDate = LocalDate.parse(join_date.split(" ")[0], DateTimeFormatter.ofPattern("yyyy/MM/dd"));
//        LocalDate resignDate = LocalDate.parse(resign_date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
//
//        int workDay = 0;
//
//        while (!resignDate.isBefore(joinDate)) {
//            if (!weekendNumber.contains(joinDate.getDayOfWeek().getValue()) && // 주말은 제외
//                    !holidayList.contains(joinDate.format(DateTimeFormatter.ofPattern("MM/dd")))) { // 공휴일 제외
//                System.out.println(joinDate + " " + joinDate.getDayOfWeek().getValue() + " " + "근무");
//                workDay = workDay + 1;
//            }
//
//            joinDate = joinDate.plusDays(1);
//        }
//
//        return workDay;
//    }
//
//    public static boolean isLeapyear(String year) {
//        int yearNumber = Integer.parseInt(year);
//        if (0 == yearNumber / 400) {
//            return Boolean.TRUE;
//        } else if (0 == yearNumber / 4 && 0 != yearNumber / 100) {
//            return Boolean.TRUE;
//        } else {
//            return Boolean.FALSE;
//        }
//    }

    public static int solution(int[] heights) {
        int result = 0;

        List<Integer> heightList = new ArrayList<>();
        for (int height : heights) {
            heightList.add(height);
        }
//                Arrays.stream(heights)
//                .boxed()
//                .collect(Collectors.toList());

        for (int i = 0; i < heightList.size(); i++) {
            if (i == 0) {
                result = result + findRight(heightList.get(i), heightList.subList(i + 1, heightList.size()));
            } else if (i == heightList.size() - 1) {
                result = result + findLeft(heightList.get(i), heightList.subList(0, i));
            } else {
                result = result + findLeft(heightList.get(i), heightList.subList(0, i));
                result = result + findRight(heightList.get(i), heightList.subList(i + 1, heightList.size()));
            }
        }

        return result;
    }

    public static int findLeft(int nowHeight, List<Integer> leftList) {
        int lookCnt = 0;
        int maxHeight = nowHeight;
        boolean check = Boolean.FALSE;
        for (int i = leftList.size() - 1; i >= 0; i--) {
            if (leftList.get(i) >= maxHeight) {
                if (leftList.get(i) == maxHeight) {
                    if (!check && maxHeight == nowHeight) {
                        check = Boolean.TRUE;
                        lookCnt = lookCnt + 1;
                    }
                } else {
                    maxHeight = leftList.get(i);
                    lookCnt = lookCnt + 1;
                }
            }
        }
        return lookCnt;
    }

    public static int findRight(int nowHeight, List<Integer> rightList) {
        int lookCnt = 0;
        int maxHeight = nowHeight;
        boolean check = Boolean.FALSE;
        for (int i = 0; i < rightList.size(); i++) {
            if (rightList.get(i) >= maxHeight) {
                if (rightList.get(i) == maxHeight) {
                    if (!check && maxHeight == nowHeight) {
                        check = Boolean.TRUE;
                        lookCnt = lookCnt + 1;
                    }
                } else {
                    maxHeight = rightList.get(i);
                    lookCnt = lookCnt + 1;
                }
            }
        }
        return lookCnt;
    }

    // [3, 5, 4, 2, 4, 4, 6, 5]
    // [2, 1, 3, 4, 4, 3, 0, 1]

    // 18
}