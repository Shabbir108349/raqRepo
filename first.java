import java.util.ArrayList;
import java.util.List;

public class first {  //Comparetor Practise
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("Shabbir","Shawon","Annie","Suraiya"));
        l.sort((a,b)->a.compareTo(b));
        System.out.println(l);
    }
    
}
