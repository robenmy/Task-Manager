package com.StructureHandling.Task.service;

import com.StructureHandling.Task.model.Ticket;
import com.StructureHandling.Task.model.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService implements ITaskService{

    @Autowired
    TicketRepository ticketRepository;



    @Override
    public List<Ticket> ticketList() {
        List<Ticket> tickets = ticketRepository.findAll();
        return tickets;
    }

    @Override
    public Ticket searchTaskByTicket(Ticket task) {
        return ticketRepository.findById(task.getTicket()).orElse(null);
    }

    @Override
    public void addNewTask(Ticket task) {
        ticketRepository.save(task);

    }

    @Override
    public void deleteTask(Ticket task) {
        ticketRepository.delete(task);

    }
}
