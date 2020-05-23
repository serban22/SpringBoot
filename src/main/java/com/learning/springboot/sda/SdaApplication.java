package com.learning.springboot.sda;

import com.learning.springboot.sda.ChairsSpring.Service.ChairService;
import com.learning.springboot.sda.ShaormaIdealaBro.Service.ShaormaService;
import com.learning.springboot.sda.ShaormaIdealaBroPostman.Service.ShaormaPostService;
import com.learning.springboot.sda.TemaExempluSpringBoot.Email;
import com.learning.springboot.sda.service.ProjectService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SdaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SdaApplication.class, args);
        ProjectService projectService = context.getBean("projectService", ProjectService.class);
        //alternativa:  ProjectService projectService = (ProjectService) context.getBean("projectService");
        System.out.println(projectService.getProjectById(1));
        System.out.println(projectService.getProjectById(2));
        System.out.println(projectService.getProjectById(3));
        System.out.println(projectService.getProjectById(4));

        ShaormaService shaormaService = context.getBean("shaormaService", ShaormaService.class);
        System.out.println(shaormaService.getShaorma("shaorma de pui", "mare", "mare", true));

        ChairService chairService = context.getBean("chairService", ChairService.class);
        System.out.println(chairService.getAllChairs());

        ShaormaPostService shaormaPostService = context.getBean("shaormaPostService", ShaormaPostService.class);
        System.out.println(shaormaPostService.getAllShaormas());
    }

}
