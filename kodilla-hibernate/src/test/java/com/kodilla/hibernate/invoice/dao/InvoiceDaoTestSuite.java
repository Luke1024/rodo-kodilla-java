package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product(1, "Good Product");
        Product product2 = new Product(2, "Better Product");
        Item item = new Item(1,product, new BigDecimal(5), 2, new BigDecimal(3));
        Item item2 = new Item(2, product2, new BigDecimal(10),2, new BigDecimal(6));
        Item item3 = new Item(3, product2, new BigDecimal(20),4,new BigDecimal(12));
        Invoice invoice = new Invoice(0,"1");

        product.setItemList(new ArrayList<>(Arrays.asList(item)));
        product2.setItemList(new ArrayList<>(Arrays.asList(item2, item3)));
        item.setProduct(product);
        item2.setProduct(product2);
        item3.setProduct(product2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        invoice.setItems(new ArrayList<>(Arrays.asList(item,item2,item3)));

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertEquals(1,id);
    }
}
