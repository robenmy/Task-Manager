package com.StructureHandling.Task.service;

import com.StructureHandling.Task.model.Ticket;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface ITaskService {
    public List<Ticket> ticketList();

    public Ticket searchTaskByTicket(Ticket task);

    public void addNewTask(Ticket task);

    public void deleteTask(Ticket task);
}
