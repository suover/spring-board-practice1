package com.practice.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.board.dto.CommentDTO;
import com.practice.board.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {

	private final CommentRepository commentRepository;

	public void save(CommentDTO commentDTO) {
		commentRepository.save(commentDTO);
	}

	public List<CommentDTO> findAll(Long boardId) {
		return commentRepository.findAll(boardId);
	}
}
