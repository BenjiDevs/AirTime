package edu.psu.ist.model;

import org.junit.jupiter.api.*;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class TripTest {

    Plane testPlane = new Plane("make", "model", 4000.0, 300);
    CurrentPackingList packList = new CurrentPackingList(32, 17);

    @Test
    @Order(1)
    void getMake() {
        assertEquals("make", testPlane.getMake());
    }

    @Test
    @Order(2)
    void getModel() {
        assertEquals("model", testPlane.getModel());
    }

    @Test
    @Order(3)
    void getSize() {
        assertEquals(4000.0, testPlane.getSize());
    }

    @Test
    @Order(4)
    void getCapacity() {
        assertEquals(300, testPlane.getCapacity());
    }

    @Test
    @Order(5)
    void setMake() {
        String make2 = "make2";
        testPlane.setMake(make2);
        assertEquals(make2, testPlane.getMake());
    }

    @Test
    @Order(6)
    void setModel() {
        String model2 = "model2";
        testPlane.setModel(model2);
        assertEquals(model2, testPlane.getModel());
    }

    @Test
    @Order(7)
    void setSize() {
        Double size2 = 3020.0;
        testPlane.setSize(size2);
        assertEquals(size2, testPlane.getSize());
    }

    @Test
    @Order(8)
    void setCapacity() {
        int cap2 = 200;
        testPlane.setCapacity(cap2);
        assertEquals(cap2, testPlane.getCapacity());
    }

    @Test
    @Order(9)
    void getItemQuantity() {
        assertEquals(32, packList.getItemsQuantity());
    };

    @Test
    @Order(10)
    void getCheckedItems() {
        assertEquals(17, packList.getCheckedItems());
    }

    @Test
    @Order(11)
    void setItemQuantity() {
        int quant2 = 41;
        packList.setItemsQuantity(quant2);
        assertEquals(quant2, packList.getItemsQuantity());
    }

    @Test
    @Order(12)
    void setCheckedItems() {
        int check2 = 21;
        packList.setCheckedItems(check2);
        assertEquals(check2, packList.getCheckedItems());
    }
}