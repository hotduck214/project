package com.plant.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.log4j.Log4j;


@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/resources/config/servlet-context.xml")
@Log4j
public class NoticeMapperTest {

	@Autowired
	private NoticeMapper mapper;
	
	//@Test
	public void insertNoticeTest () {
		NoticeVO vo = new NoticeVO();
		vo.setNotice_title("게시물 제목");
		vo.setNotice_content("게시물 내용");
		
		int r = 0;
		for (int i=0; i < 100; i++)
			r += mapper.insert(vo);
		
		log.info("등록개수 :" +r);
		
	}
	
	//@Test
	public void list() {
		
		NoticeVO vo = new NoticeVO();
		
		List<NoticeVO> list = mapper.list(vo);
		list.forEach(NoticeVO ->log.info(vo));
		log.info(list);
		
	}
	@Test
		public void update() {
			NoticeVO vo = new NoticeVO();
			
			vo.setNotice_title("게시물제목 수정@");
			vo.setNotice_content("게시물 내용 수정@");
			vo.setNotice_no(8);
			
			
			log.info("update :" +mapper.update(vo));
			
		}
}
