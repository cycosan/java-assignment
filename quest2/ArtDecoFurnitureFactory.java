// Concrete Factory class for creating Art Deco furniture objects
package quest2;
public class ArtDecoFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new Chair("Art Deco");
    }

    public Sofa createSofa() {
        return new Sofa("Art Deco");
    }

    public CoffeeTable createCoffeeTable() {
        return new CoffeeTable("Art Deco");
    }
}
