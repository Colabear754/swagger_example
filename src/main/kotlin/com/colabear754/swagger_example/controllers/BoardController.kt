package com.colabear754.swagger_example.controllers

import com.colabear754.swagger_example.domain.BoardDTO
import com.colabear754.swagger_example.mapper.BoardMapper
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Api(tags = ["게시판 글 API"], description = "게시판 글을 다루는 API")
@RestController
class BoardController(private val boardMapper: BoardMapper) {
    @ApiOperation(value = "게시글 목록 조회", notes = "모든 게시글 목록을 조회합니다.")
    @GetMapping("/document-list")
    fun document_list(): List<BoardDTO> = boardMapper.getDocuments()
}