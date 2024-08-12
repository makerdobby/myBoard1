package com.example.myboard.service.serviceimpl;

import com.example.myboard.mapper.BoardMapper;
import com.example.myboard.service.BoardService;
import com.example.myboard.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardMapper bMapper;

    @Override
    public List<BoardVO> getAllBoards() {
        return bMapper.selectAll();
    }
}
