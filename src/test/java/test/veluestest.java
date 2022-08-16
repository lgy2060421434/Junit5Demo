package test;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import test1.jijie;

import java.util.stream.Stream;

public class veluestest {
    //    参数化
    @ParameterizedTest
    @ValueSource(ints = {1, 3, 4})
    void test(int argeres) {
        System.out.println("test:" + argeres);
    }

    @ParameterizedTest
    // 还支持空白字符，tab和回车
    @ValueSource(strings = {"hello", "hi", "\t", "\n", " "})
    // String也支持传空或者null
    @EmptySource
    @NullSource
    void testString(String ss) {
        System.out.println("test:" + ss);
    }

    @ParameterizedTest
    // 枚举类
    @EnumSource(jijie.class)
    void EnumTest(Enum enums) {
        System.out.println(enums);
    }


}
