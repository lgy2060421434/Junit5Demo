package testCacse;

import org.junit.jupiter.api.*;

//DisplayName展示类名和方法
@DisplayName("测试展示类")
public class junit5DemoClasss1 {
    @AfterAll
    static void afterall() {
        System.out.println("aferall");
    }

    @DisplayName("测试方法1")
    @Test
    void test() {
        System.out.println("你好test5");
    }

    @BeforeAll
    @DisplayName("BeforeAll注解")
    static void befor() {
        System.out.println("befoer");
    }

    @BeforeEach
    void beforeach() {
        System.out.println("beforeach");
    }

    @AfterEach
    void afetereach() {
        System.out.println("afetereach");
    }

    @Test
    @Disabled
//    Disabled不执行为这个注释的方法
    void test1() {
        System.out.println("test1");
    }

    //RepeatedTest执行两次
    @RepeatedTest(2)
    void test2() {
        System.out.println("test2");
    }
}
