package encaps2;

public class Practice6 {
    // Encapsulated Engine class
    private Engine engine;

    // Constructor initializes Engine object
    public Practice6() {
        engine = new Engine();
    }

    // Public method to start the car (indirectly starts engine)
    public void startCar() {
        engine.startEngine();
    }

    // Private inner class
    private class Engine {
        private void startEngine() {
            System.out.println("Engine Started");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Practice6 myCar = new Practice6();
        myCar.startCar();  // Output: Engine Started
    }
}
