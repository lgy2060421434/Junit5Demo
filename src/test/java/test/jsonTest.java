package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
@SuppressWarnings("unchecked")
public class jsonTest {
    //    参数化yaml文件传值
    @ParameterizedTest
    @MethodSource
    public void yamlTest(HashMap<String,Object> Logindate) {
        System.out.println("ceshi:"+Logindate.get("account"));
        System.out.println("test:"+Logindate.get("statusCode"));
    }

    static ArrayList<HashMap<String,String>> yamlTest() throws IOException {
        // 对json文档进行反序列化
        ObjectMapper mapper = new ObjectMapper();
        // ArrayList<HashMap<String,String>> 是json文档中定义的参数类型
        ArrayList<HashMap<String,String>> addTestData=(ArrayList<HashMap<String, String>>) mapper.readValue(new File("src/test/resources/user.json"),
                new ArrayList<HashMap<String,String>>().getClass());
        return addTestData;
    }
}
