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


