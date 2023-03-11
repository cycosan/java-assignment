package quest2;
class FurnitureShop {
    private FurnitureFactory factory;

    FurnitureShop(FurnitureFactory factory) {
        this.factory = factory;
    }

    void orderFurniture() {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        System.out.println("Ordered furniture:");
        System.out.println("Chair: " + chair.getType());
        System.out.println("Sofa: " + sofa.getType());
        System.out.println("Coffee Table: " + coffeeTable.getType());
    }
}