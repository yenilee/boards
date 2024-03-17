package com.yeni.board.models


data class BoardCreateDto (
    val name: String
)

fun BoardCreateDto.toEntity() = Board(
        name = this.name
)