package com.colabear754.swagger_example.domain

import java.sql.Timestamp

data class DocumentDTO(
    var seq: Int,
    var reg_time: Timestamp,
    var subject: String,
    var content: String,
    var view_cnt: Int,
    var like_cnt: Int
)
