<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Produtos</title>
</head>
<body>
    <h1>Cadastro de produto</h1>
    <form action="/natal-1/produto">
        nome: <input type="text" name="nome" id="nome"> <br />
        valor: <input type="number" name="valor" id="valor" min="0.00" max="10000.00" step="0.01"><br />
        id categoria: <input type="number" name="id_categoria" id="id_categoria"><br />
        <input type="submit" value="Salvar">
    </form>
</body>
</html>