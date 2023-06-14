<!doctype html>
<html>
<head>
    <title>Flights</title>
</head>
<body>
    <h1>Список рейсів</h1>
    <table>
        <tr>
            <th>Пілот</th>
            <th>Штурман</th>
            <th>Стюард1</th>
            <th>Стюард2</th>
            <th>Місто відправки</th>
            <th>Місто прибуття</th>
            <th>Дата</th>
            <th></th>
        </tr>
        <#list flights as flight>
            <tr>
                <td>${flight.pilot}</td>
                <td>${flight.shturman}</td>
                <td>${flight.stuard1}</td>
                <td>${flight.stuard2}</td>
                <td>${flight.from}</td>
                <td>${flight.to}</td>
                <td>${flight.date}</td>
                <td><a href="/flights/delete/${flight.id}">Видалити</a></td>
            </tr>
        </#list>
    </table>
</body>
</html>