package com.ssafy.network_02.board.model

data class Board(
    var content: String,
    val no: Int,
    val regtime: String,
    var title: String,
    var writer: String
) {
    constructor() : this("",0,"","","")
}