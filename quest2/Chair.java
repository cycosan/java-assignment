// Chair class implementing Furniture interface
package quest2;
public class Chair implements Furniture {
    private String type;

    public Chair(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}