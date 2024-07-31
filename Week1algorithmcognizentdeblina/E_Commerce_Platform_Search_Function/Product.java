package E_Commerce_Platform_Search_Function;

public class Product {
        private int pId;
        private String pName;
        private String c;

        public Product(int productId, String productName, String category) {
            this.pId = productId;
            this.pName = productName;
            this.c = category;
        }

        public String getProductName() {
            return pName;
        }



    }

