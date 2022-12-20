package com.colabear754.swagger_example.domain

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class BoardDTO(
    var seq: Int,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    var reg_time: LocalDateTime,
    var subject: String,
    var content: String,
    var view_cnt: Int,
)
