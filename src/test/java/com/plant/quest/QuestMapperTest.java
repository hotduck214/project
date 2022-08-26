package com.plant.quest;

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
public class QuestMapperTest {
	
	@Autowired
	private QuestMapper mapper;
	
	//@Test
	public void insertQuestTest() {
		
		QuestVO vo = new QuestVO();
		
		int r = 0;
		for(int i=0; i<120; i++) {
		vo.setQuest_title("질문게시판 제목"+ r);
		vo.setQuest_content("질문게시판 내용"+ r);
		
			r += mapper.insert(vo);
			
			
			log.info("※※※등록갯수※※※ " + r);
		}
		
	}
	
	//@Test
	public void listQuestTest() {
		
		QuestVO vo = new QuestVO();
		
		Map map = new HashMap();
		map.put("startIdx", 1);
		map.put("pageRow", 10);
		
		List<QuestVO> list = mapper.list(vo);
		
		list.forEach(QuestVO -> log.info(vo));
	}
	
	//@Test
	public void count() {
		
		QuestVO vo = new QuestVO();
		
		Map map = new HashMap();
		map.put("stype", "all");
		map.put("sword", "1");
		
		int totalCount = mapper.count(vo);
		log.info("총 카운트 : "+totalCount);
		
		
	}
//	@Test
	public void view() {
		mapper.updateViewcount(1);
		log.info(mapper.view(3));
		
	}
	
	
	
}