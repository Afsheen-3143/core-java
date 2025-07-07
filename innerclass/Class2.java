package innerclass;

public class Class2 {
    class MemberInner {
        void show() {
            System.out.println("Hello from MemberInner!");
        }
    }

    public static void main(String[] args) {
        Class2 outer = new Class2();               // Create outer class instance
        MemberInner member = outer.new MemberInner(); // Use outer instance
        member.show();
    }
}


