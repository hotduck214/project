package com.plant.ask;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

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
public class AskMapperTest {
	
	@Autowired
	private AskMapper mapper;
}
	
//	@Test
//	public void insertTest() {
//		
//		AskVO vo = new AskVO();
//		
//		int r = 0;
//		
//		for(int i = 0; i < 182; i++) {
//			
//			vo.setAsk_title("문의사항 게시글 T" + r);
//			vo.setAsk_content("문의사항 게시글 T" + r);
//			
//			r += mapper.insert(vo);
//			
//			log.info("@@@@@@@@@@@@@@@@@@@@등록개수@@@@@@@@@@@@@@@@@@@@@@@@@" + r);
//			
//		}
//	}
//}
//	@Test
//	public void list() {
//		
//		AskVO vo = new AskVO();
//		
//		Map map = new HashMap();
//		
//		map.put("startIdx", 1);
//		map.put("pageRow", 10);
//		
//		List<AskVO> list = mapper.list(vo);
//		list.forEach(AskVO -> log.info(vo));
//	}
//}
//	

//}
//	@Test
//	public void count() {
//		
//		AskVO vo = new AskVO();
//		
//		Map map = new HashMap();
//		map.put("stype", "all");
//		map.put("sword", "1");
//		
//		int totalCount = mapper.count(vo);
//		log.info("총 게시글 수 : " + totalCount);
//	}
//	@Test
//	public void view() {
//	
//		mapper.updateViewcount(1);
//		
//		log.info(mapper.view(190));
//
//	}
//
//}