package com.xst.test.dao;

import com.xst.dao.ResourcesDao;
import com.xst.entity.V9Resources;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by sl on 16-2-26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:conf/spring.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:conf/springmvc.xml")
})

public class ResourcesDaoTest {

    @Autowired
    private ResourcesDao resourcesDao;

    @Test
    public void testDateTurn(){
        V9Resources v9Resources = resourcesDao.getById(39026);
        Assert.assertNotNull(v9Resources);
        System.out.println(v9Resources.getCreatime());
    }

    @Test
    public void testGetResourcesOfLeaf(){
        List<V9Resources> v9ResourcesList = resourcesDao.getResourcesOfLeaf(3728);
        Assert.assertNotNull(v9ResourcesList);
        int count=0;
        for(V9Resources resources : v9ResourcesList){
            System.out.println(resources.getTitle());
            count++;
        }
        System.out.println("count = "+count);
    }

}