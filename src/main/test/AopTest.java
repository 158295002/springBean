import com.evada.annotationAop.AopConfig;
import com.evada.model.Fruit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dingqin
 * @date 2017/11/2
 */
@RunWith(SpringJUnit4ClassRunner.class)//测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes = AopConfig.class)
public class AopTest {

    @Autowired
    private Fruit apple;

    @Test
    public void aopTest(){
        apple.wash();
        apple.wash("，参数洗苹果");
    }
}
