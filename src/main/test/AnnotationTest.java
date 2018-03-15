import com.evada.annotationConfig.CDPlayer;
import com.evada.annotationConfig.AnnotationConfig;
import com.evada.xmlConfig.BlackDisc;
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
 * @date 2017/10/9
 */
@RunWith(SpringJUnit4ClassRunner.class)//测试开始的时候自动创建Spring的应用上下文
@ContextConfiguration(classes = AnnotationConfig.class)//会告诉它需要在CDPlayerConfig中加载配置
public class AnnotationTest {

    @Autowired
    private CDPlayer cd;

    @Test
    public void cdShouldNotNull(){
        assertNotNull("不通过，对象为空",cd);
        cd.play();
    }

    /**
     * xml的加载方式，测试时需将类头的两个注解注释掉
     */
    @Test
    public void sdTest(){
        BeanDefinitionRegistry reg = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(reg);
        reader.loadBeanDefinitions(new ClassPathResource("springConfig.xml"));
        BeanFactory bf=(BeanFactory)reg;
        BlackDisc bd = (BlackDisc) bf.getBean("blackDisc");
        assertNotNull("不通过，对象为空",bd);
        bd.play();
    }

}
