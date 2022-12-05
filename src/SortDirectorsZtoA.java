import java.util.Comparator;
import java.util.List;

public class SortDirectorsZtoA extends Director implements Comparator<Director> {

    public void sortByDirectorZtoA(List<Director> directors) {
        SortDirectorsZtoA sortDirectorsZtoA = new SortDirectorsZtoA();
        directors.sort(sortDirectorsZtoA);
        for (Director m : directors) {
            System.out.println("-----------------------------------------");
            System.out.println(m);
        }

    }

    @Override
    public int compare(Director o1, Director o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
