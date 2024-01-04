package example2;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class PostServicePoint {
    private Item[] registeredItems;
    private List<Item> processedItems;
    private int maxWeight;
    private int count;

    public PostServicePoint(int maxWeight) {
        registeredItems = new Item[10];
        processedItems = new ArrayList<>();
        count = 0;
        this.maxWeight = maxWeight;
    }

    public void register(Item item) {
        switch (count) {
            case 10:
                System.out.println("no available capacity!");
                break;
        
            default:
                registeredItems[count++] = item;
                break;
        }
    }

    public boolean checkItemAddress(String adr) {
        if (adr.length() < 20) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkItemWeight(int wgh) {
        if (wgh < maxWeight) {
            return true;
        } else {
            return false;
        }
    }

    public void printPrice(int i) {
        Item item = registeredItems[i];
        int wgh = item.getWeight();
        if ( wgh % 2 != 0) {
            wgh++;
        }
        int price = wgh * 6;
        System.out.println("The price for sending is: " + price);

    }

    public void printAllPrices(){
        for(int i = 0; i < count; i++) {
            printPrice(i);
        }
    }

    public void processOne() {
        Item item = registeredItems[count-1];
        boolean flag = true;
        if (!checkItemAddress(item.getAddress())) {
            System.out.println("invalid address!");
            flag = false;
        } 
        if (!checkItemWeight(item.getWeight())) {
            System.out.println("invalid weight!");
            flag = false;
        }

        if (flag) {
            registeredItems[--count] = null;
            processedItems.add(item);
        }

    }

    public void processAll() {
        while(count > 0) {
            processOne();
        }
    }

    public int totalweight() {
        int sum = 0;
        for (Item item : processedItems) {
            sum += item.getWeight();
        }
        return sum;
    }

    public Map<String,Integer> checkCategories() {
        Map<String,Integer> categoryMap = new HashMap<>();
        for (Item item : processedItems) {
            if(!categoryMap.containsKey(item.getCategory())) {
                categoryMap.put(item.getCategory(),1);
            } else {
                int newVal = categoryMap.get(item.getCategory()) + 1;
                categoryMap.remove(item.getCategory());
                categoryMap.put(item.getCategory(), newVal);
            }
        }

        return categoryMap;
    }

    public void removeCategory(String c) {
        for (Item item : processedItems) {
            if (item.getCategory().equals(c)) {
                processedItems.remove(item);
            }
        }
    }





}
