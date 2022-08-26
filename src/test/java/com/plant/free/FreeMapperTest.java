package com.plant.free;

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
public class FreeMapperTest {

	@Autowired
	private FreeMapper mapper;
	
//	//@Test
//	public void insertFreeTest () {
//		
//		FreeVO vo = new FreeVO();
//		
//		int r = 0;
//	
//		for(int i=0; i<112; i++) {
//			r += mapper.insert(vo);
//
//		vo.setFree_title("자유게시판 제목"+ r);
//		vo.setFree_content("자유게시판 내용" + r);
//		
//		
//			
//		log.info("등록개수 : " + r);
//		}
//			
//		
//	}
	
//	@Test
//	public void list() {
//		
//		FreeVO vo = new FreeVO();
//		
//		Map map = new HashMap();
//		map.put("startIdx", 10);
//		map.put("PageRow", 10);
//		
//		
//		List<FreeVO> list = mapper.list(vo);
//		list.forEach(NoticeVO ->log.info(vo));
//		log.info(list);
//		
//	}
	
//	//@Test 
//	public void update() {
//		
//		FreeVO vo = new FreeVO();
//		vo.setFree_title("자유게시판 제목 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
//		vo.setFree_content("자유게시판 내용 수정");
//		
//		vo.setFree_no(23);
//		
//		log.info("update:" +mapper.update(vo));
//		
//	}
//	@Test 
//	public void view() {
//		
//		mapper.updateViewcount(1);
//		log.info(mapper.view(1));
//	}
}
