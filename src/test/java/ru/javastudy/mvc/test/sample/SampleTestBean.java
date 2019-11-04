package ru.javastudy.mvc.test.sample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.javastudy.mvcHtml5Angular.mvc.bean.SampleBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:mvc-config.xml", "classpath:application-context.xml"})
public class SampleTestBean {

//Comment  this 'bean class="org.springframework.web.servlet.view.XmlViewResolver" ' in mvc-context.xml
//to avoid 'Caused by: java.lang.IllegalStateException:WebApplicationObjectSupport instance [org.springframework.web.servlet.view.XmlViewResolve'

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void sampleTest() {
        SampleBean sampleBean = applicationContext.getBean("sampleBean", SampleBean.class);
        Assert.assertNotNull(sampleBean);

        sampleBean = (SampleBean) applicationContext.getBean("sampleBean");
        Assert.assertNotNull(sampleBean);

        Assert.assertEquals(sampleBean.getNumber(), 666);
        Assert.assertEquals(sampleBean.getStringValue(), "postConstructValue");
    }

}

/*
Вначале мы используем две аннотации. @RunWith — аннотация из фреймворка JUnit.
С помощью нее мы указываем как будем запускать наш тестирующий класс.
Класс, который указывается для этой аннотации должен быть унаследован от Runner.
В нашем случае мы указываем класс из пакета org.springframework.test.context.junit4, который был подключен в pom.xml в начале статьи.

Вторая важная аннотация — @ContextConfiguration.
С помощью этой аннотации мы можем определить файлы конфигурации контекста Spring приложения.
Здесь показана возможность перечисления нескольких xml файлов через запятую и в фигурных скобках.
Далее внутри класса мы используем автосвязывание для получения доступа к объекту контекста приложения.
С помощью него мы проверяем корректность создания бина, а также инициализацию двух полей этого бина.
*/
