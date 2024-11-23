package com.example.ticketing_system.services;

import com.example.ticketing_system.entities.Ticket;
import com.example.ticketing_system.repositories.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;
    public TicketService(TicketRepository ticketRepository) {

        this.ticketRepository = ticketRepository;
    }
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();

    }
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
