package abstraction;

//public class Abstra5 {
//
//}
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

interface Button {
    void render();
}

interface Checkbox {
    void render();
}

class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }
    
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering Windows button");
    }
}

class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering Windows checkbox");
    }
}

public class Abstra5{
	public static void main(String[] args) {

GUIFactory factory = new WindowsFactory();
Button button = factory.createButton();
button.render();
	}
}
