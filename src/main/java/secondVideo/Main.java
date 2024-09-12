package secondVideo;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade Oranı";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("makineFoto.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(2);
        product2.setImageUrl("makineFoto2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(4);
        product3.setImageUrl("makineFoto3.jpg");

        Product[] products = {product1, product2, product3};

        for(Product product: products){
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05555555555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Cemre");
        individualCustomer.setLastName("Şenyuva");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Etiya");
        corporateCustomer.setPhone("05005000000");
        corporateCustomer.setTaxNumber("11111111");
        corporateCustomer.setCustomerNumber("23456");

        Customer[] customers = {individualCustomer, corporateCustomer};
    }
}
