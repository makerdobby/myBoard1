package com.example.myboard.service;

import com.example.myboard.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BoardService {
    public List<BoardVO> getAllBoards();
}
