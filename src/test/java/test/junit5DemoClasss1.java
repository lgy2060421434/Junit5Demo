package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class junit5DemoClasss1 {
    @Test
    @Tag("test22")
    void testDemo1() {
        System.out.println("test1Demo1");
    }

    @Test
    @Tag("test22")
    void testDemo2() {
        System.out.println("test1Demo2");
    }

    @Test
    @Tag("test")
    void testDemo3() {
        System.out.println("test1Demo3");
    }
}
