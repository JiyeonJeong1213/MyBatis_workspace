package com.kh.mybatis.board.model.service;

import static com.kh.mybatis.common.template.Template.getSqlSession;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.board.model.dao.BoardDao;
import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.board.model.vo.Reply;
import com.kh.mybatis.common.model.vo.PageInfo;

public class BoardService {

	private BoardDao boardDao = new BoardDao();
	
	public int selectListCount() {
		SqlSession sqlSession = getSqlSession();
		
		int listCount = new BoardDao().selectListCount(sqlSession);
		
		sqlSession.close();
		
		return listCount;
	}
	public ArrayList<Board> selectList(PageInfo pi){
		SqlSession sqlSession = getSqlSession();
		
		ArrayList<Board> list = boardDao.selectList(sqlSession, pi);
		
		sqlSession.close();
		
		return list;
	}
	
	public int increaseCount(int boardNo) {
		SqlSession sqlSession = getSqlSession();
		
		int result = boardDao.increaseCount(sqlSession, boardNo);
		
		if(result>0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}
	public Board selectBoard(int boardNo) {
		SqlSession sqlSession = getSqlSession();
		Board b = boardDao.selectBoard(sqlSession, boardNo);
		sqlSession.close();
		return b;
	}
	public ArrayList<Reply> selectReplyList(int boardNo){
		SqlSession sqlSession = getSqlSession();
		ArrayList<Reply> list = boardDao.selectReplyList(sqlSession, boardNo);
		sqlSession.close();
		return list;
	}
	
	public int selectSearchCount(HashMap map) {
		SqlSession sqlSession = getSqlSession();
		int searchListCount = boardDao.selectSearchListCount(sqlSession, map);
		sqlSession.close();
		return searchListCount;
	}
	public ArrayList<Board> selectSearchList(HashMap map, PageInfo pi){
		SqlSession sqlSession = getSqlSession();
		ArrayList<Board> list = boardDao.selectSearchList(sqlSession, map, pi);
		sqlSession.close();
		return list;
	}
}
