package com.example.myboard.controller;

import com.example.myboard.service.BoardService;
import com.example.myboard.service.serviceimpl.BoardServiceImpl;
import com.example.myboard.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class BoardController {
    @Autowired
    BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }

    @GetMapping("/all")
    public List<BoardVO> getAllBoards() {
        return boardService.getAllBoards();
    }

}
