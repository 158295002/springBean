import com.evada.xmlConfig.BlackDisc;
import com.evada.xmlConfig.XmlConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author dingqin
 * @date 2017/10/20
 */
@RunWith(SpringJUnit4ClassRunner.class)//测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes = XmlConfig.class)
public class XmlConfigTest {

    @Autowired
    private BlackDisc bd;

    @Test
    public void bdTest(){
        assertNotNull(bd);
        bd.play();
    }

    /**
     * 代码加载资源的测试(一般不用这个)
     */
    @Test
    public void loadXmlTest(){
        BeanDefinitionRegistry reg = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(reg);
        reader.loadBeanDefinitions(new ClassPathResource("springConfig.xml"));
        BeanFactory bf=(BeanFactory)reg;
        BlackDisc bd = (BlackDisc) bf.getBean("blackDisc");
        assertNotNull("不通过，对象为空",bd);
        bd.play();
    }
}
