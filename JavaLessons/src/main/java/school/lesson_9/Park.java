package school.lesson_9;

        import java.util.ArrayList;
        import java.util.List;

public class Park {
    private List<Attraction> attractions = new ArrayList<>();

    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public String getInfo() {
            return name + " (Working hours: " + workingHours + ", Cost: " + cost + " BYN)";
        }
    }

    public void addAttraction(String name, String workingHours, double cost) {
        attractions.add(new Attraction(name, workingHours, cost));
    }


    public void showAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction.getInfo());
        }
    }
}
