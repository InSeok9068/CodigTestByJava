import java.util.*;
import java.util.stream.Stream;

public class Main {
    @SuppressWarnings({"unused", "MismatchedQueryAndUpdateOfCollection", "ResultOfMethodCallIgnored"})
    public static void main(String[] args) {
        /* ------------------------- 변수 선언 ------------------------------*/
        String stringS = "";
        Integer integerN = 1;
        int intN = 1;
        int[] arrayN = new int[]{1};
        String[] arrayS = new String[]{"1"};
        List<String> listS = List.of("1");
        List<Integer> listN = List.of(1);
        List<Integer> listArrayList = new ArrayList<>(List.of(1));
        List<Integer> listLinkedList = new LinkedList<>(List.of(1));
        Stream<String> streamS = Stream.of("1");
        Stream<Integer> streamN = Stream.of(1);
        Map<String, Object> mapS = Map.of("key", "value");
        Map<String, Object> mapHashMap = new HashMap<>();
        Map<String, Object> mapLinkedHashMap = new LinkedHashMap<>();
        Set<String> setS = Set.of("1");
        Set<String> setHashSet = new HashSet<>();
        Set<String> setLinkedHashSet = new LinkedHashSet<>();
        Deque<String> dequeS = new ArrayDeque<>(List.of("1"));
        PriorityQueue<Integer> priorityQueueS = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueueReverseS = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> priorityQueueCustomS = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        /* ------------------------- 변수 선언 ------------------------------*/

        /* ------------------------- 유틸 클래스 ------------------------------*/
        Arrays.stream(arrayN);
        Arrays.sort(arrayN);
        Collections.sort(listArrayList);
        /* ------------------------- 유틸 클래스 ------------------------------*/

        // 사용 Start!!!!
    }
}