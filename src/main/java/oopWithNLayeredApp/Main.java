package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "iPhone 15", 50000);
        List<Logger> loggers = List.of(new DatabaseLogger(), new FileLogger(), new MailLogger());

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);

    }
}
