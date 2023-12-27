import org.springframework.aop.framework.DefaultAdvisorChainFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import javax.swing.*;

/**
 * @author Fickler
 * @date 2023/12/26 18:19
 */
public class BeanFactoryTest {

    public static void main(String[] args) {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("beans.xml");
        Object userService = beanFactory.getBean("userService");
        System.out.println(userService);
        Object userDao = beanFactory.getBean("userDao");
        System.out.println(userDao);

    }

}
