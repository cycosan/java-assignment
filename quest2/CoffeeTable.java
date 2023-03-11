// CoffeeTable class implementing Furniture interface
package quest2;
public class CoffeeTable implements Furniture {
    private String type;

    public CoffeeTable(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}