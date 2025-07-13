import java.util.function.Function;

public class second {
    public static void main(String[] args) {
        Function<Integer,String> f = x-> x.toString();
        System.out.println(f.apply(2));
    }
}
