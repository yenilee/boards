package com.yeni.board.services

import com.yeni.board.models.BoardCreateDto
import com.yeni.board.models.toEntity
import com.yeni.board.models.Board
import com.yeni.board.repositories.BoardRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BoardService {
    @Autowired
    private lateinit var boardRepository: BoardRepository

    fun getList(): List<Board> {
        return boardRepository.findAll()
    }

    fun create(boardDto: BoardCreateDto ) {
        val loadedBoard = boardDto.toEntity()
        boardRepository.save(loadedBoard)
    }
}