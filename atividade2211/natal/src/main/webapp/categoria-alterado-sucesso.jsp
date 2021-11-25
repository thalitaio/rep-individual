<%
    int id = (int)request.getAttribute("id");
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet" href="../css/style.css">
    <title>Categoria Alterada com Sucesso</title>
</head>
<body>
     <h1>Sucesso</h1>
    <h3>Categoria de id: <%= id %> alterada com sucesso!</h3><br />
    <button><a href="http://localhost:8080/natal-1/categoriamodel/listar">&#10052; Listar Categorias Atualizadas &#10052;</a></button>
</body>
</html>