package quest2;
// Concrete Factory class for creating Victorian furniture objects
public class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new Chair("Victorian");
    }

    public Sofa createSofa() {
        return new Sofa("Victorian");
    }

    public CoffeeTable createCoffeeTable() {
        return new CoffeeTable("Victorian");
    }
}
