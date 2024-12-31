package Enums;

public class EnumWithFieldsExample {
    enum TrafficLight {
        RED("Stop"), YELLOW("Caution"), GREEN("Go");

        private final String action;

        // Constructor
        TrafficLight(String action) {
            this.action = action;
        }

        // Getter method
        public String getAction() {
            return action;
        }
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + ": " + light.getAction());
        }
    }
}
