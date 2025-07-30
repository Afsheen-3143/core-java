package lambdaExpression;

import java.util.function.BiFunction;

//public class MethodRef2 {
//	
//
//}
class Product1 {
    String name;
    double price;

    Product1(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class MethodRef2 {
    public static void main(String[] args) {
        BiFunction<String, Double, Product1> createProduct = Product1::new;

        Product1 p = createProduct.apply("Phone", 799.99);
        System.out.println(p.name + " - $" + p.price);
    }
}