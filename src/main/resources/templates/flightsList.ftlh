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
                <td>${flight.pilot.name}</td>
                <td>${flight.shturman.name}</td>
                <td>${flight.stuard1.name}</td>
                <td>${flight.stuard2.name}</td>
                <td>${flight.from}</td>
                <td>${flight.to}</td>
                <td>${flight.date}</td>
                <td><a href="/flights/delete/${flight.id}">Видалити</a></td>
            </tr>
        </#list>
    </table>
</body>
</html>