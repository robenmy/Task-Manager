package com.StructureHandling.Task;

import com.StructureHandling.Task.model.Ticket;
import com.StructureHandling.Task.service.ITaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class TaskManagerApplication /*implements CommandLineRunner*/ {



	public static void main(String[] args) {

		SpringApplication.run(TaskManagerApplication.class, args);
	}



}




