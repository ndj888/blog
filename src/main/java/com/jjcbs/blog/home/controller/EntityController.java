package com.jjcbs.blog.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by longbob on 17-7-1.
 */

@Controller
public class EntityController {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @GetMapping("/testEntity")
    public @ResponseBody
    List testEntity(){
        EntityManager em = entityManagerFactory.createEntityManager();
        return em.createQuery("from BlogArticle ").getResultList();
    }
}
