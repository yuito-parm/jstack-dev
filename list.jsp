<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Fish" %>
<html>
    <head>
        <title>リスト一覧</title>
    </head>
    <body>
        <h2>🐟 在庫一覧 🐟</h2>
        <table border="1">
            <tr>
                <th>魚種</th>
                <th>価格</th>
                <th>特徴</th>
                <th>状態</th>
                <th>在庫数</th>
            </tr>
            <%
                List<Fish> fishList = (List<Fish>)request.getAttribute("fishList");
                if (fishList != null && !fishList.isEmpty()) {
                    for (Fish fish : fishList) {
            %>
            <td><%= fish.fishName %></td>
            <td><%= fish.price %></td>
            <td><%= fish.feature %></td>
            <td><%= fish.status %></td>
            <td><%= fish.stock %></td>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="5">まだお魚はいません！🐠✨</td>
            </tr>
            <%
                }
            %>
        </table>
        <p><a href="form.jsp">新規追加</a></p>
    </body>
</html>