package com.squidward.beans;

import com.beans.ProjectUser;
import org.junit.Test;
import org.meanbean.test.BeanTester;

public class ProjectUserTest {
    @Test
    public void testProjectUser() {
        BeanTester beanTester = new BeanTester();
        beanTester.testBean(ProjectUser.class);
    }
}
