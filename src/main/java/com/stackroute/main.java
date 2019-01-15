package com.stackroute;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import com.sun.org.apache.xerces.internal.impl.dv.xs.BaseDVFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class main {
    public static void main(String[] args) {
//        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Actor actor=(Actor)beanFactory.getBean("actor"); //for actor parameters
//        System.out.println(actor);
//        Movie movie=(Movie)beanFactory.getBean("movie1"); //for movie parameters
//        System.out.println(movie);
//
//        //beandefinition factory
//        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Actor actor1= (Actor) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("actor");
//        System.out.println(actor1);
//
//        //ApplicationContext
//
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie2=(Movie) applicationContext.getBean("movie1");
//        System.out.println(movie2);

        //application context
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Movie movieOne=(Movie) applicationContext.getBean("movie2");
        Movie movieTwo=(Movie) applicationContext.getBean("movie");
        Movie movieThree=(Movie) applicationContext.getBean("movie4");
        System.out.println(movieOne);
        System.out.println(movieOne==movieTwo);
       // System.out.println(movie11==movie12);
    }
}
