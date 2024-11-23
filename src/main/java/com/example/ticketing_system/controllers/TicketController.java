package com.example.ticketing_system.controllers;

import com.example.ticketing_system.entities.Ticket;
import com.example.ticketing_system.services.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;

    }
    @GetMapping
    public List<Ticket> getAllTickets(){
        return ticketService.getAllTickets();
    }
    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket){
        return ticketService.createTicket(ticket);
    }
}
