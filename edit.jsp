<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="controller.Fish" %>
<%
    Fish fish = (Fish)request.getAttribute("fish");
    int index = (Integer)request.getAttribute("index");
%>

<html>
    <head>
        <title>編集フォーム</title>
    </head>
    <body>
        <h2>お魚データ編集</h2>
        <form action="update" method="post">
            <input type="hidden" name="index" value="<%= index %>">
            <label for="fishName">魚種：</label>
                <input type="text" name="fishName" id="fishName" value="<%= fish.fishName %>"><br>
                <label for="price">価格：</label>
                <input type="number" name="price" id="price" value="<%= fish.price %>"><br>
                <label for="feature">特徴：</label>
                <textarea name="feature" id="feature" rows="3" cols="30"><%= fish.feature %></textarea><br>
                <label for="status">状態：</label>
                <textarea name="status" id="status" rows="2" cols="30"><%= fish.status %></textarea><br>
                <label for="stock">在庫数：</label>
                <input type="number" name="stock" id="stock" value="<%= fish.stock %>"><br>
                <input type="submit" value="保存">
        </form>
    </body>
</html>