package suit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import test.junit5DemoClasss1;


@RunWith(JUnitPlatform.class)
@SelectPackages({
        "testCacse"
})

@SuppressWarnings("unchecked")
public class junit5SuitDemo {
}
