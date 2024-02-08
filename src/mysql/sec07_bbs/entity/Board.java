package mysql.sec07_bbs.entity;

import java.time.LocalDateTime;

public class Board {
	private int bid;
	private String title;
	private String content;
	private String uid;
	private LocalDateTime modTime;
	private int isDeleted;
	private int viewCount;
	private int replyCount;
	private String uname;		// Board table에는 없지만 join을 통해서 얻어오는 정보
}