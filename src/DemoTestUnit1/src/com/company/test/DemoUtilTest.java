package com.company.test;

import com.company.code.DemoUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by prasert on 7/7/2016.
 */
public class DemoUtilTest {
    @DataProvider
    public Object[][] dataComeXpayY() {
        Object[][] obj = {
                {4, 2, 100, 1, 100.0},
                {4, 2, 100, 2, 200.0},
                {5, 3, 100, 5, 300.0},
                {5, 3, 100, 6, 400.0}
        };
        return obj;
    }

    @Test(dataProvider = "dataComeXpayY")
    public void test3(int come, int pay, double perHead, int pax, double e) throws Exception {
        assertEquals(DemoUtil.comeXpayY(come, pay, perHead, pax), e);
    }

    @Test
    public void testComeXpayY() throws Exception {
        assertEquals(DemoUtil.comeXpayY(4, 2, 100, 1), 100.0);
        assertEquals(DemoUtil.comeXpayY(4, 2, 100, 2), 200.0);
        assertEquals(DemoUtil.comeXpayY(4, 2, 100, 3), 300.0);
        assertEquals(DemoUtil.comeXpayY(4, 2, 100, 4), 200.0);
        assertEquals(DemoUtil.comeXpayY(4, 2, 100, 5), 300.0);
        assertEquals(DemoUtil.comeXpayY(4, 2, 100, 6), 400.0);
        assertEquals(DemoUtil.comeXpayY(4, 2, 100, 7), 500.0);
        assertEquals(DemoUtil.comeXpayY(4, 2, 100, 8), 400.0);
    }
    @Test
    public void test() throws Exception {
        assertEquals(DemoUtil.comeXpayY(5, 3, 100, 5), 300.0);
        assertEquals(DemoUtil.comeXpayY(5, 3, 100, 6), 400.0);
    }

    @DataProvider
    public Object[][] data() {
        Object[][] obj = new Object[3][3];
        obj[0][0] = 1;
        obj[0][1] = 100.0;
        obj[0][2] = 75.0;

        obj[1][0] = 2;
        obj[1][1] = 100.0;
        obj[1][2] = 140.0;

        obj[2][0] = 6;
        obj[2][1] = 100.0;
        obj[2][2] = 300.0;
        return obj;
    }

    @Test(dataProvider = "data")
    public void test2(int item, double pricePerItem, double e) throws Exception {
        assertEquals(DemoUtil.promotion(item, pricePerItem), e);
    }

    @Test
    public void testPromotion() throws Exception {
        assertEquals(DemoUtil.promotion(1, 100), 75.0);
        assertEquals(DemoUtil.promotion(2, 100), 140.0);
        assertEquals(DemoUtil.promotion(3, 100), 180.0);
        assertEquals(DemoUtil.promotion(4, 100), 240.0);
        assertEquals(DemoUtil.promotion(5, 100), 300.0);
        assertEquals(DemoUtil.promotion(10, 100), 500.0);
    }

    @Test
    public void testCircle() throws Exception {
        assertEquals(DemoUtil.circle(10), 314.159);
        assertEquals(DemoUtil.circle(10), 314.1592653589);
        assertEquals(DemoUtil.circle(10), 314.1592, .001);
        assertTrue(5 > 3);
        assertEquals(5 > 3, true);
        assertFalse(4 < 2);
        assertEquals(4 < 2, false);
        assertEquals("hello", "hello");
        assertEqualsNoOrder(new String[]{"red", "white", "blue"},
                new String[]{"white", "blue", "red"});
        assertEquals(new String[]{"red", "white", "blue"},
                new String[]{"white", "blue", "red"});
    }

}