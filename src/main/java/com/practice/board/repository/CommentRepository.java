package com.practice.board.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.practice.board.dto.CommentDTO;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CommentRepository {

	private final SqlSessionTemplate sql;

	public void save(CommentDTO commentDTO) {
		sql.insert("Comment.save", commentDTO);
	}

	public List<CommentDTO> findAll(Long boardId) {
		return sql.selectList("Comment.findAll", boardId);
	}
}
