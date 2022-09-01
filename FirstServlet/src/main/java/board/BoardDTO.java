package board;

import java.sql.Date;

public class BoardDTO {
	private int boardNo;
	private String title;
	private String content;
	private String wirter;
	private int viewCount;
	private Date postTime;
	
	public BoardDTO() {
		super();
	}

	public BoardDTO(int boardNo, String title, String content, String wirter, int viewCount, Date postTime) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.wirter = wirter;
		this.viewCount = viewCount;
		this.postTime = postTime;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWirter() {
		return wirter;
	}

	public void setWirter(String wirter) {
		this.wirter = wirter;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
}
