//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Product[] p = {
                    new Product(1,"Product1","Sales"),
                    new Product(10, "Product10","Sales"),
                    new Product(3,"Product3", "Sales"),
                    new Product(4,"Product4","Sales"),
                    new Product(7,"Product7","Market"),
                    new Product(5,"Product5","Market"),
                    new Product(2,"Product2", "Technical"),
                    new Product(6,"Product6", "Sales"),
                    new Product(9,"Product9", "Market"),
                    new Product(8,"Product8", "Sales")
            };
        System.out.println("Performing Linear Search : If product is found product Description is listed" +
                " else " +
                "null is listed");
        ProductSearch pserach = new ProductSearch();
        System.out.println(pserach.LinearSearch(p,2));
        System.out.println(pserach.LinearSearch(p,300));
        System.out.println("Performing Binary Search");
        System.out.println(pserach.BinarySearch(p,3));
        System.out.println(pserach.BinarySearch(p,100));
    }
}