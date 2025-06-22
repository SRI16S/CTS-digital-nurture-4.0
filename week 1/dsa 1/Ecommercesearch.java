import java.util.Arrays;
import java.util.Comparator;

class ECommercesearch {
    static class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return productId + " - " + productName + " (" + category + ")";
        }
    }

    public static int linearSearch(Product[] products, String targetName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(targetName)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void printArray(Product[] products) {
        System.out.print("[");
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i]);
            if (i != products.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Notebook", "Stationery"),
            new Product(105, "Shoes", "Footwear")
        };

        System.out.println("Linear Search:");
        int linearIndex = linearSearch(products, "Shoes");
        if (linearIndex != -1) {
            System.out.println("Found at index " + linearIndex + ": " + products[linearIndex]);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("Products before sorting:");
        printArray(products);

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("Products after sorting (for binary search):");
        printArray(products);

        System.out.println(" Binary Search:");
        int binaryIndex = binarySearch(products, "Shoes");
        if (binaryIndex != -1) {
            System.out.println("Found at index " + binaryIndex + ": " + products[binaryIndex]);
        } else {
            System.out.println("Product not found.");
        }
    }
}
