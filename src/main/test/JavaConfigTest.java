import com.evada.javaConfig.JavaConfig;
import com.evada.javaConfig.PhoneDisc;
import com.evada.javaConfig.PhoneDiscQualifer;
import com.evada.model.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dingqin
 * @date 2017/10/31
 */
@RunWith(SpringJUnit4ClassRunner.class)//测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes = JavaConfig.class)
public class JavaConfigTest {

    @Autowired
    @PhoneDiscQualifer
    private PhoneDisc pd;

    @Autowired
    private PhoneDisc pdc;

    @Test
    public void testPhone(){
        Assert.assertNotNull(pd);
        pd.play();
        pdc.play();
        System.out.println(pd.toString());//在JavaConfig中bean的范围为SCOPE_PROTOTYPE时，则这两个的内存是不一样的
        System.out.println(pdc.toString());
    }

}
