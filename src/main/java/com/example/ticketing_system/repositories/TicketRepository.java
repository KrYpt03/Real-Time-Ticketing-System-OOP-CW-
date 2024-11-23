package com.example.ticketing_system.repositories;

import com.example.ticketing_system.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
