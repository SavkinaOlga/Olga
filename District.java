import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Define the District class
class District implements Serializable {
    private String name;
    private int population;

    public District(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "District: " + name + ", Population: " + population;
    }
}

// Define the City class
class City implements Serializable {
    private List<District> districts = new ArrayList<>();

    public void addDistrict(District district) {
        districts.add(district);
    }

    public List<District> getDistricts() {
        return districts;
    }
}