<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
       .design {
        background-color: azure;
        color: black;
        text-align: center;
        border-radius: 20px;
        border: 2px solid blue;
        padding: 20px;
        box-shadow: 2px 2px 10px dodgerblue;
}


    </style>
</head>
<body>
    <div class="design">

    <h1>Student Data</h1>
    <form action="student/add" method="post">
        <label>Name:</label>
        <input type="text" name="name"><br><br>

        <label>Department:</label>
        <input type="text" name="dept"><br><br>

        <button type="submit">Add</button>
    </form>
</div>
</body>
</html>