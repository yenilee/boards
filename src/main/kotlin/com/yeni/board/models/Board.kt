package com.yeni.board.models

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
class Board(
        @Id @GeneratedValue val id: UUID = UUID.randomUUID(),
        @Column(length = 50, nullable = false)
        var name:String,
        val createdAt: LocalDateTime = LocalDateTime.now(),
        var updatedAt: LocalDateTime? = null,
        var deletedAt: LocalDateTime? = null,
)