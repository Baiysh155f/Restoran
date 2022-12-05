import java.util.Comparator;

public class Cast extends Movie implements Comparator<Cast> {
    private String actorFullname;
    private String role;

    public Cast(String actorFullname, String role) {
        this.actorFullname = actorFullname;
        this.role = role;
    }

    public Cast() {

    }

    public String getActorFullname() {
        return actorFullname;
    }

    public void setActorFullname(String actorFullname) {
        this.actorFullname = actorFullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Fullname :" + actorFullname +
                "\nrole :" + role;
    }

    @Override
    public int compare(Cast o1, Cast o2) {
        return o2.getActorFullname().compareTo(o1.getActorFullname());
    }
}
