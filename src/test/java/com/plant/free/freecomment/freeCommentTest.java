package com.plant.free.freecomment;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.plant.freecomment.FreeCommentMapper;
import com.plant.freecomment.FreeCommentVO;

import lombok.extern.log4j.Log4j;


@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/resources/config/servlet-context.xml")
@Log4j
public class freeCommentTest {

	@Autowired
	private FreeCommentMapper mapper;
	
	//@Test
	public void insertFreeCommentTest () {
		FreeCommentVO vo = new FreeCommentVO();
		vo.setContent("댓글 내용");
		
		int r = 0;
		for (int i=0; i < 100; i++)
			r += mapper.insert(vo);
		
		log.info("등록개수 :" +r);
		
	}
	
	//@Test
	public void list() {
		
		FreeCommentVO vo = new FreeCommentVO();
		
		List<FreeCommentVO> list = mapper.list(vo);
		list.forEach(FreeCommentVO ->log.info(vo));
		log.info(list);
		
	}
//	@Test
//		public void update() {
//			FreeCommentVO vo = new FreeCommentVO();
//			
//			vo.setFreeComment_content("게시물 내용 수정@");
//			vo.setFreeComment_no(8);
//			
//			
//			log.info("update :" +mapper.update(vo));
//			
//		}
}
