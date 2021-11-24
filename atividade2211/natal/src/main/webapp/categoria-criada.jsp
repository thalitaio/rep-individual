<%
    int id = (int)request.getAttribute("id");
%>


<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <title>Categoria Criada</title>
</head>
<body>
    <h2>Categoria id:<%= id %> cadastrada com sucesso!</h2><br />
    <button><a href="http://localhost:8080/natal-1/categoriamodel/listar" style="color: #fff;text-decoration: none;">&#10052; Listar Categorias &#10052;</a></button>
</body>
</html>