package com.yeni.board.models


data class BoardDto (
    val name: String
)

fun BoardDto.toEntity() = Board(
        name = this.name
)