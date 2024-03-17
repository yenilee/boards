package com.yeni.board.repositories

import com.yeni.board.models.Board
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface BoardRepository : JpaRepository<Board, Long>