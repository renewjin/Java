package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music>{
// 필드
	private String title;
	private String singer;

	// 메서드
	// 생성자 : 기본
	public Music() {
	}
	// 생성자 : 필수
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	// getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	
	@Override
	public String toString() {
		return "곡명 : " + title + ", 가수 : " + singer;
	}
	
	// sort comparTo 비교의 기준을 만들어주자!
	@Override
	public int compareTo(Music o) {
		// 두 Music의 제목을 비교하여 정렬
		return this.title.compareTo(o.title);
	}
}
