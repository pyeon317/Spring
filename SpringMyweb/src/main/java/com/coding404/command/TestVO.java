package com.coding404.command;

import com.google.protobuf.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter 세터만 생성
//@Getter 게터만 생성
//@ToString 투스트링만 생성

@Data//getter.setter.toString을 자동생성
@NoArgsConstructor //기본생성자
@AllArgsConstructor//모든 매개변수를 받는 생성자
public class TestVO {

	private String id;
	private String pw;
	private String name;
	private int age;
	private Timestamp regdate;
}
