import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Director implements Comparable<Director> {
    private String name;
    private String lastName;

    public Director() {
    }

    public Director(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name :" + name+
                "\nlastName :" + lastName;
    }
    public void sortByDirector(List<Director> directors) {
        System.out.println("press 1 to sort from A to Z");
        System.out.println("press 2 to sort from Z to A");
        SortDirectorsZtoA sortDirectorsZtoA= new SortDirectorsZtoA();
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        switch (str) {
            case 1:
            Collections.sort(directors);
            for (Director m : directors) {
                System.out.println("-----------------------------------------");
                System.out.println(m);
            }break;
            case 2:
                sortDirectorsZtoA.sortByDirectorZtoA(directors);
                break;
        }
    }

    @Override
    public int compareTo(Director o) {
        return getName().compareTo(o.getName());
    }
}
