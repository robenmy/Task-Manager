package com.StructureHandling.Task.controller;


import com.StructureHandling.Task.model.Ticket;
import com.StructureHandling.Task.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
//http://localhost:8080/ticket-pts/
@RequestMapping("ticket-pts")
//@CrossOrigin(value = "http://localhost:3000") //Spring esta ubicado en el puerto 8080 pero con esta notacion permitira recibir de otro puerto
public class TicketController {

    private static final Logger logger =
            LoggerFactory.getLogger(TicketController.class);

    @Autowired
    private ITaskService taskService;

    // //http://localhost:8080/ticket-pts/empleados
    @GetMapping("/empleados")
    public List<Ticket> obtenerEmpleados(){
        var tickets = taskService.ticketList();
        //tickets.forEach((ticket -> logger.info(ticket.toString())));
        return tickets;
    }
}
