import com.evada.model.Fruit;
import com.evada.spEl.AppleConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dingqin
 * @date 2017/11/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppleConfig.class)
public class SpelTest {

    @Autowired
    private Fruit apple;

    @Test
    public void appleTest(){
        apple.wash();
    }
}
