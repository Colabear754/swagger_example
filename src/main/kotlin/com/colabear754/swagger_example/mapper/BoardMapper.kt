package com.colabear754.swagger_example.mapper

import org.apache.ibatis.annotations.Mapper

@Mapper
interface MemberMapper {
    fun getDocuments(): List<String>
}