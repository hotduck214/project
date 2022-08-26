<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, user-scalable=yes">
    <meta name="format-detection" content="telephone=no, address=no, email=no">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <title>게시판 등록</title>
    <link rel="stylesheet" href="/plant/css/reset.css"/>
    <link rel="stylesheet" href="/plant/css/contents.css"/>
    <script>
    	function goSave() {
    		frm.submit();
    	}
    </script>
</head>
<body>
    
        <div class="sub">
            <div class="size">
                <h3 class="sub_title">질문게시판 수정</h3>
    
                <div class="bbs">
                <form method="post" name="frm" id="frm" action="update.do"  ><!-- enctype="multipart/form-data" -->
                <input type="hidden" name="quest_no" value="${data.quest_no }">
                    <table class="quest_write">
                        <tbody>
                        <tr>
                            <th>제목</th>
                            <td>
                                <input type="text" name="quest_title" id="quest_title" class="wid100" value="${data.quest_title }"/>
                            </td>
                        </tr>
                        <tr>
                            <th>내용</th>
                            <td>
                                <textarea name="quest_content" id="quest_content">${data.quest_content }</textarea>
                            </td>
                        </tr>
                        <tr>
                        	<th>첨부파일</th>
                        	<td>
                        		<input type="file" name="filename">
                        	</td>
                        </tr>
                        </tbody>
                    </table>
                    <div class="btnSet"  style="text-align:right;">
                        <a class="btn" href="javascript:goSave();">수정하기 </a>
                    </div>
                    </form>
                </div>
            </div>
        </div>
        
</body>
</html>