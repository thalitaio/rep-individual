<%@ page import="com.natal.natal.models.CategoriaModel"%>

<%
    CategoriaModel model = (CategoriaModel)request.getAttribute("model");
%>

<!DOCTYPE html>
<html lang="pr-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet" href="../css/style.css">
    <title>Alterar Categorias</title>
</head>
<body>
    <h1>Categoria -  Alterando</h1>
    <form action="/natal-1/categoriamodel/alterar" method="post">
        Id: <input type="text" name="id" id="id" value="<%= model.getId() %>"> <br />
        Nome: <input type="text" name="nome" id="nome" value="<%= model.getNome() %>"> <br />
        Descrição: <input type="text" name="descricao" id="descricao" value="<%= model.getDescricao() %>">
        <input type="submit" value="Alterar">
    </form>
</body>
</html>