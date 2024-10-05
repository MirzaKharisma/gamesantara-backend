package com.example.rakyatgamezomeapi.repository;

import com.example.rakyatgamezomeapi.model.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, String> {
}
