import com.evada.javaAopConfig.model.Car;
import com.evada.javaAopConfig.JavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dingqin
 * @date 2017/11/23
 */
@RunWith(SpringJUnit4ClassRunner.class)//测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes = JavaConfig.class)
public class JavaAopConfigTest {

    @Autowired
    private Car car;

    @Test
    public void test(){
        car.refuel();
        car.run();
    }

}
