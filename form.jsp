<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <title>新規追加フォーム</title>
    </head>
    <body>
        <h2>新規データ追加</h2>
        <form action="add" method="post">
            <label for="fishName">魚種：</label>
            <input type="text" name="fishName" id="fishName"><br>
            <label for="price">価格：</label>
            <input type="number" name="price" id="price"><br>
            <label for="feature">特徴：</label>
            <textarea name="feature" id="feature" rows="3" cols="30"></textarea><br>
            <label for="status">状態：</label>
            <textarea name="status" id="status" rows="2" cols="30"></textarea><br>
            <label for="stock">在庫数：</label>
            <input type="number" name="stock" id="stock"><br>
            <input type="submit" value="追加">
        </form>
        <p><a href="list">一覧に戻る</a></p>
    </body>
</html>