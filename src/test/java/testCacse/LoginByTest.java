package testCacse;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class LoginByTest {
    private static HashMap<String, Object> map = new HashMap<String, Object>();

    @Test
    void test() {
        map.put("login", "登录成功");
    }



//倒叙执行类似于suit（junit4）
    @Nested
    class buy {
        @Test
        void test2() {
            if (map.get("buy")!=null){
                System.out.println("正在支付");
            }
            else {
                System.out.println("请购买课程");
            }
        }
    }

    @Nested
    class ByTest {
        @Test
        void buytest() {
            if (map.get("login").equals("登录成功")) {
                map.put("buy", "课程");
                System.out.println("登录成功啦");
            } else {
                System.out.println("登录失败");
            }
        }
    }

}
