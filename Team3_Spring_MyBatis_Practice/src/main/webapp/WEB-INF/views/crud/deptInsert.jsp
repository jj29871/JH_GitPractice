<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 
</head>
<body>
<div style="margin-top:70px;"></div> 
<form action="" method="post" > 
 <div align="center"> 
    <table width="600" border="0" cellpadding="10"> 
        <tr align="center" bgcolor="#dddddd" height="50"> 
            <td colspan="2"> 
                <font size="4" color="#082249" face="arial"> 
                <b> 
                Department 정보 추가
                </b> 
                </font> 
            </td> 
        </tr> 
        <tr> 
            <td width="25%" align="center" > 
                <b>부서 번호</b> 
            </td> 
            <td> 
                <input type="text" size="40"  name="deptno" maxlength="10">
            </td> 
        </tr>     
        <tr> 
            <td width="25%" align="center"> 
                <b>부서 이름</b> 
            </td> 
            <td> 
                <input type="text" size="40" name="dname" maxlength="60" > 
            </td> 
        </tr> 
        <tr> 
            <td width="25%" align="center"> 
                <b>부서 위치</b> 
            </td> 
            <td> 
                <input type='text' size="40" cols="50" class="box2" name="loc">
            </td> 
        </tr> 
        <tr bgcolor="#dddddd"> 
            <td colspan="2" align="center" class="c2"> 
                <input type="submit" class="btn btn-secondary" value="추가" id="btnsumbit" >&nbsp;&nbsp;&nbsp;
                <input type="button" class="btn btn-secondary" value="취소" onClick="location.href='deptList.htm'"> 
         
            </td> 
        </tr> 
     
    </table> 
 </div> 
 <hr>

</form> 
</body>
</html>