package com.example.myboard.mapper;

import com.example.myboard.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVO> selectAll();


}
