package quest2;
// Concrete Factory class for creating modern furniture objects
public class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new Chair("Modern");
    }

    public Sofa createSofa() {
        return new Sofa("Modern");
    }

    public CoffeeTable createCoffeeTable() {
        return new CoffeeTable("Modern");
    }
}
