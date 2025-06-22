import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {
//    private int productId;
//    public ProductSearch(int productId){
//        this.productId = productId;
//    }
    public Product LinearSearch(Product[] p,int productId){
        System.out.println("Searching Product Details With ProductId "+productId);
        for(int i = 0;i < p.length; i++){
            System.out.println("Searching product..");
            if(p[i].getProductId() == productId)
                return p[i];
        }
        System.out.println("Did not find the product with the productId "+productId);
        return null;
    }
    public Product BinarySearch(Product[] p, int productId){
        System.out.println("Seraching Product Details With ProductId "+productId);
        Arrays.sort(p, Comparator.comparing(Product::getProductId));
        int low = 0;
        int high = p.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(p[mid].getProductId() == productId){
                return p[mid];
            }
            else if(p[mid].getProductId() > productId){
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        System.out.println("Did not find the product with the productId "+productId);
        return null;
    }
}
