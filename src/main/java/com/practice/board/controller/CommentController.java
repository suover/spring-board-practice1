package com.practice.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.board.dto.CommentDTO;
import com.practice.board.service.CommentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

	private final CommentService commentService;

	@PostMapping("/save")
	public @ResponseBody List<CommentDTO> save(@ModelAttribute CommentDTO commentDTO) {
		System.out.println("commentDTO = " + commentDTO);
		commentService.save(commentDTO);
		List<CommentDTO> commentDTOList = commentService.findAll(commentDTO.getBoardId());
		return commentDTOList;
	}
}
