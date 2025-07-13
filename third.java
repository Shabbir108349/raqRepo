import java.util.List;

public class third {
    public static void main(String[] args) {
        List<Integer> l = List.of(36,43,23,32,1,34,5);
        List<Integer> ll = l.stream().filter(x->x%3 == 0).toList();
        System.out.println(ll);
    }
}
