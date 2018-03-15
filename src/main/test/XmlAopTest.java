import com.evada.model.Fruit;
import com.evada.xmlAop.XmlAopConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dingqin
 * @date 2017/11/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = XmlAopConfig.class)
public class XmlAopTest {

    @Autowired
    private Fruit apple;

    @Test
    public void xmlAopTest(){
        apple.wash();
    }
}
