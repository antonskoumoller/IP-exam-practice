package example1;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class SmartGarden {
    private int roomLight;
    private int waterTankLevel;
    private List<Plant> plants;
    private Map<Plant,Integer> plantMap;
    
    
    public SmartGarden(int roomLight, int waterTankLevel) {
        this.roomLight = roomLight;
        this.waterTankLevel = waterTankLevel;
        plants = new ArrayList<>();
        plantMap = new HashMap<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);

        if (plantMap.containsKey(plant)) {
            int newValue = plantMap.get(plant) + 1;
            plantMap.remove(plant);
            plantMap.put(plant, newValue);
        } else {
            plantMap.put(plant, 1);
        }
    }

    public void waterPlants() {
        for (Plant plant : plants) {
            if(plant.getRequiredWater() <= waterTankLevel) {
                plant.water(decreaseWaterTankLevel(plant.getRequiredWater()));
            } else {
                throw new LowWaterLevelException("there is not enough water");
            }
        }
    }

    private int decreaseWaterTankLevel(int water) {
        waterTankLevel += -water;
        return water;
    }

    public void checkLighting() {
        for (Plant plant : plants) {
            if (roomLight - plant.getOptimalLightingLevel() < 0) {
                System.out.println("plant " + plant.getName() +" requires less light");
            }

            if (roomLight - plant.getOptimalLightingLevel() == 0) {
                System.out.println("plant " + plant.getName() +" has the perfect amount of light");
            }

            if (roomLight - plant.getOptimalLightingLevel() > 0) {
                System.out.println("plant " + plant.getName() +" requires more light");
            }
        }
    }

    public Map<Plant,Integer> numberOfPlants() {  
        return plantMap;
    }

    public void printReport() {
        for (Map.Entry<Plant,Integer> plant : plantMap.entrySet()) {
            plant.getKey().printReport();
        }
    }
    
}
