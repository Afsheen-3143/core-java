package innerclass;

public class Class3 {

    private String outerMessage = "Hello from Class3 Outer!";

    // 1Member Inner Class (Non-static)
    class MemberInner {
        void show() {
            System.out.println("MemberInner: " + outerMessage);
        }
    }

    //  Static Nested Class
    static class StaticNested {
        void show() {
            System.out.println("StaticNested: Can’t access outer non-static members directly.");
        }
    }

    // Local Inner Class (inside a method)
    void demonstrateLocalInner() {
        class LocalInner {
            void show() {
                System.out.println("LocalInner: Defined inside a method.");
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.show();
    }

    //  Anonymous Inner Class (without a name)
    void demonstrateAnonymousInner() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymousInner: Running thread-like behavior.");
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        //  Create an instance of the outer class (Class3)
        Class3 outer = new Class3();

        // Member Inner Class usage (requires outer instance)
        MemberInner member = outer.new MemberInner();
        member.show();

        // Static Nested Class usage (no outer instance needed)
        StaticNested staticNested = new StaticNested();
        staticNested.show();

        // Local Inner Class usage
        outer.demonstrateLocalInner();

        // Anonymous Inner Class usage
        outer.demonstrateAnonymousInner();
    }
}
