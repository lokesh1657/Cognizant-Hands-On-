
class Product{
    int productId;
    String productName;
    String category;

    Product(int productId, String productName,String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }

    void display(){
        System.out.println("Product ID:" + productId);
        System.out.println("product name:"+ productName);
        System.out.println("Category"+ category);
    }
}



class LinearSearch{
    public static Product search(Product[] products, int id){
        for(Product p:products){
            if(p.productId ==id){
                return p;
            }
        }
        return null;
    }
}

class BinarySearch{
    public static Product search(Product[] products ,int id){
        int low=0;
        int high=products.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(products[mid].productId==id){
                return products[mid];
            }
            else if(products[mid].productId < id){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return null;
    }
}

public class EcommerceSearch{
    void main(){
        Product[] products={
            new Product(101,"Laptop","Electronics"),
            new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Travel")
        };

        int searchId=103;
        System.out.println("Linear seacrch");

        Product result1=LinearSearch.search(products,searchId);
        if(result1 != null)
            result1.display();
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("binary search");

        Product result2=BinarySearch.search(products, searchId);
        if(result2 !=null)
            result2.display();
        else
            System.out.println("product not found");

        
    }

}