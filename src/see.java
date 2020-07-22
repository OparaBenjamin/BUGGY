import java.io.Serializable;

public class see implements Serializable {
    private int id;
    private String name;

    public see(int id, String name) {
        this.id = id;
        this.name= name;
    }

    @Override
    public String toString() {
        return "see{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
