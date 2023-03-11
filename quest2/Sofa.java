package quest2;
public class Sofa implements Furniture {
    private String type;

    public Sofa(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}