package com.yeni.board.controllers

import com.yeni.board.models.BoardDto
import com.yeni.board.models.Board
import com.yeni.board.services.BoardService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardController (private val boardService: BoardService) {

    @GetMapping("/")
    fun getBoards(): List<Board> {
        return boardService.getList()
    }

    @PostMapping("/")
    fun createBoard(@RequestBody boardDto: BoardDto): ResponseEntity<Board> {
        boardService.create(boardDto)
        return ResponseEntity(HttpStatus.CREATED)
    }

}