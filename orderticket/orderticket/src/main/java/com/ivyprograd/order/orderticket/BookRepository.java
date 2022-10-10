package com.ivyprograd.order.orderticket;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface BookRepository extends JpaRepository<BookOrder,Long> {

    }

