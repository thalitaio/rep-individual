<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Produtos</title>
</head>
<body>
    <h1 style="text-align: center;">Cadastro de produto</h1>
    <form action="/natal-1/produto" style="background:rgb(182, 179, 179);text-align:center;color: black;margin: 10px; text-transform: capitalize;">
        nome: <input type="text" name="nome" id="nome" style="margin: 7px;"> <br />
        valor: <input type="number" name="valor" id="valor" min="0.00" max="10000.00" step="0.01" style="margin: 7px;"><br />
        id categoria: <input type="number" name="id_categoria" id="id_categoria" style="margin: 7px;"><br />
        <input type="submit" value="Salvar">
    </form>
</body>
</html>