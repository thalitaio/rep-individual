-- Crie uma tabela de Produto com as seguintes colunas: id(identidade e incremental), nome, descrição, codigo e preço. Todas devem ser de preenchimento obrigatório.
-- Crie uma tabela de Categoria com as seguintes colunas: id(identidade e incremental), nome, descrição. Apenas a coluna descrição deve permitir valores nulos.
-- Crie uma tabela de Carro com as seguintes colunas: id(identidade e incremental), modelo e marca. Todas devem ser de preenchimento obrigatório.

create table Produto(
	id int generated always as identity
	,nome varchar(25) not null
	,descricao varchar(50) not null
	,codigo varchar(20) not null
	,preco float not null
);

create table Categoria(
	id int generated always as identity
	,nome varchar(25) not null
	,descricao varchar(50) null
);

create table Carro(
	id int generated always as identity
	,modelo varchar (25) not null
	,marca varchar(20) not null
);

-- Adicione duas novas colunas em carro. As colunas devem ser: chassi e ano. 
-- As duas colunas devem ser de preenchimento obrigatório. 

alter table carro 
add column chassi varchar(20) not null default '000ABC';

alter table carro
add column ano int not null default '0000';

-- Remove a coluna códido, da tabela Produto.

alter table produto
drop column código;

-- Delete a tabela Carro.
drop table carro;

-- Adicione uma nova coluna na tabela Produto. 
-- A coluna deve ser o id da categoria e não deve permitir nulos.
alter table produto
add column catID int not null;

-- Adicione uma constraint a coluna id de categoria da tabela Produto. 
-- A constraint deve ser uma Foreign Key para a coluna Id, da tabela Categoria.
alter table produto
drop column id;
alter table produto
add column id int primary key generated always as identity;

alter table categoria
drop column id;
alter table categoria
add column id int primary key generated always as identity;

alter table produto
add constraint fk_produto foreign key(catID) references categoria(id);


-- Crie uma ScriptsSQL em um repositório Git e salve os scripts criados nesta atividade 
-- dentro desta pasta. Envie as alterações para o GitHub através dos comandos GIT. 
-- No GitHub, adicione o usuário maykondgranemann, como colaborador.

-- Exercício 42

-- Insira 3 categorias na tabela categoria
insert into categoria (
	nome
	,descricao 
)
values(
	'nome3'
	,'sobrenome3'
);

--Insira 6 produtos na tabela produto.
select * from produto;
insert into produto(
	nome 
	,descricao 
	,preco
	,catid 
)
values(
	'prod6'
	,'prod6 descricao'
	,40.00	
	,7
);

-- Altere a descrição de dois produtos.
update produto 
	set
		descricao = 'nova descricao 1'
	where nome = 'prod2';

-- Delete um produto e uma categoria
delete from produto 
where nome = 'prod4';

delete from categoria 
where nome = 'nome2';

-- Altere uma categoria de um produto.
ALTER TABLE produto RENAME COLUMN nome TO nomezaum;

-- Altere o preço de todos os produtos tirando R$1,00 do preço atual.
update produto 
	set
		preco = preco - 1;
	
-- Liste todos os dados de todas as colunas da tabela Categoria.
-- Liste todos os dados de todas as colunas da tabela Produto.
select * from categoria c ;
select * from produto p ;

-- Liste os dados de todas as colunas da tabela Categoria, 
-- para as linhas que possuam uma descrição preenchida.
select * from categoria c 
where (descricao  is not null);

-- Liste os dados das colunas Id, nome e preço da tabela Produto, 
-- para as linhas que possuem um nome iniciando com C.
select 
	p.id
	,p.nomezaum
	,p.preco
from produto p where nomezaum = 'c%';

-- Liste os dados das colunas Id, nome e preço da tabela Produto e os 
-- dados id, nome e descrição da tabela Categoria para as linhas que 
-- possuem um preço maior que 0.

select 
	p.id
	,p.nomezaum
	,p.preco 
	,c.id 
	,c.nome
	,c.descricao 
from produto p 
join categoria c on p.preco > 0;

-- Liste os dados de todas as colunas da tabela Produto que possuem categoria com Id maior que 2.

select * 
from produto p where catid > 2;

-- Liste os dados de todas as colunas da tabela Categoria e o 
-- os dados da coluna nome da tabela Produto, para as categorias 
-- que estão sendo utilizadas por produtos.

select * 
from categoria c
join produto p on c.nome where c.id = p.catid;



