import game.inventory.Inventory;
import game.inventory.Item;

public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();

        // TODO: Create 3 Item objects and add them to the inventory
        // Suggested items:
        //   "Galaxy Racer",  "Racing",  12 units, serial "GR-4421"
        //   "Shadow Realm",  "RPG",      5 units, serial "SR-8873"
        //   "Pixel Legends", "Strategy", 3 units, serial "PL-0091"
        Item item1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item item3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);

        // TODO: Call displayAll()
        shop.displayAll();

        System.out.println();

        // TODO: Sell some copies:
        //   Sell 4 copies of "Galaxy Racer"
        //   Sell 6 copies of "Shadow Realm" (should trigger warning — only 5 in stock)
        item1.sell(4);
        item2.sell(6);

        System.out.println();

        // TODO: Call displayAll() again to show updated stock
        shop.displayAll();

        System.out.println();

        // TODO: Call auditSerialCodes()
        shop.auditSerialCodes();

        // TODO: Try calling getSerialCode() directly from here — it should FAIL to compile.
        //       Leave this as a COMMENT explaining why it doesn't work:
        // System.out.println(item1.getSerialCode()); 
        // WHY does this fail? Because getSerialCode() is package-private (has no access modifier),
        // so it cannot be accessed from GameShop which is outside the game.inventory package.
    }
}
