package polymorphism2;

class a {
    Object geta() {
        return 4;  
    }
}

class b extends a {
    @Override
   Short geta() {  // ✅ Covariant return: String is a subclass of Object
        return 6;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        a A = new b();  // Upcasting
        System.out.println(A.geta());  // Output: affu
    }
}
