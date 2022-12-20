package com.colabear754.swagger_example.mapper

import com.colabear754.swagger_example.domain.BoardDTO
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BoardMapper {
    fun getDocuments(): List<BoardDTO>
}