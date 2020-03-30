package com.xqk.learn.springboot.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring工具类，BeanUtils类测试
 *
 * @author 熊乾坤
 * @date 2020-03-05 0:26
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBeanUtilsTestTest {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class PersonDup {
        private String name;
    }

    /**
     * 测试静态私有类的成员变量拷贝
     */
    @Test
    public void testCopyPropertiesWithStaticClass() {
        Person person = new Person("xqk");
        PersonDup personDup = new PersonDup();
        BeanUtils.copyProperties(person, personDup);
        log.info("**********{}", personDup.toString());
        System.out.println(personDup.toString());

        personDup = new PersonDup("kqx");
        BeanUtils.copyProperties(personDup, person);
        log.info("**********{}", person.toString());
        System.out.println(person.toString());

    }
}
