package com.kh.mybatis.board.model.vo;

import java.sql.Date;
import java.util.ArrayList;

public class Board {
	private int boardNo; //	BOARD_NO
	private String boardTitle; //	BOARD_TITLE
	private String boardContent; //	BOARD_CONTENT
	private String boardWriter; //	BOARD_WRITER
	private int count; //	COUNT
	private Date createDate; //	CREATE_DATE
	private String status; //	STATUS
	
	private ArrayList<Reply> replyList;
	
	public Board() {
		super();
	}
	public Board(int boardNo, String boardTitle, String boardContent, String boardWriter, int count, Date createDate,
			String status) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
		this.count = count;
		this.createDate = createDate;
		this.status = status;
	}
	
	
	
	public ArrayList<Reply> getReplyList() {
		return replyList;
	}
	public void setReplyList(ArrayList<Reply> replylist) {
		this.replyList = replylist;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardWriter=" + boardWriter + ", count=" + count + ", createDate=" + createDate + ", status="
				+ status + ", replylist=" + replyList + "]";
	}
	
}
