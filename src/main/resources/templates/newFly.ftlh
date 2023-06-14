<!doctype html>
<html>
<head>
    <title>Додавання нового рейсу</title>
</head>
<body>
    <h1>Додавання нового рейсу</h1>
    <form action="/flights/addNew" method="post">
        Пілот:<input type="text" name="pilot"><br><br>
        Штурман:<input type="text" name="shturman"><br><br>
        Стюард1:<input type="text" name="stuard1"><br><br>
        Стюард2:<input type="text" name="stuard2"><br><br>
        Місто відправки:<input type="text" name="from"><br><br>
        Місто прибуття:<input type="text" name="to"><br><br>
        Дата: <input type="text" name="date"><br><br>
        <input type="submit" value="Додати"/>
    </form>
</body>
</html>