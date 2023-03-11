package quest2;
import java.util.Scanner;  // Import the Scanner class
// Client code that uses the abstract factory and its products
// Example usage
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        System.out.println("Enter design type ");
        String designType = input.nextLine();
        if (designType.equals("modern")){
        FurnitureShop shop = new FurnitureShop(new ModernFurnitureFactory());
        shop.orderFurniture();
        }
        else  if (designType.equals("victorian")){

        FurnitureShop shop = new FurnitureShop(new VictorianFurnitureFactory());
        shop.orderFurniture();
        }
        else  if (designType.equals("artdeco")){

        FurnitureShop shop = new FurnitureShop(new ArtDecoFurnitureFactory());
        shop.orderFurniture();
        }
    }
}
