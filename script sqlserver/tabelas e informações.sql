-- Tabela de unidades
CREATE TABLE unidade (
    id INT PRIMARY KEY IDENTITY(1,1),
    descricao VARCHAR(50) NOT NULL
);

-- Tabela de categorias
CREATE TABLE categoria (
    id INT PRIMARY KEY IDENTITY(1,1),
    descricao VARCHAR(50) NOT NULL
);

-- Tabela de itens
CREATE TABLE item (
    id INT PRIMARY KEY IDENTITY(1,1),
    descricao VARCHAR(100) NOT NULL,
    quantidade INT NOT NULL,
    id_unidade INT NOT NULL,
    id_categoria INT NOT NULL,
    FOREIGN KEY (id_unidade) REFERENCES unidade(id),
    FOREIGN KEY (id_categoria) REFERENCES categoria(id)
);



-- Inserts de exemplo na tabela unidade
INSERT INTO unidade (descricao) VALUES ('Unidade');

INSERT INTO unidade (descricao) VALUES ('Caixa');

INSERT INTO unidade (descricao) VALUES ('Litro');

-- Inserts de exemplo na tabela categoria
INSERT INTO categoria (descricao) VALUES ('Alimento');

INSERT INTO categoria (descricao) VALUES ('Limpeza');

INSERT INTO categoria (descricao) VALUES ('Higiene');

-- Inserts de exemplo na tabela int (itens)
INSERT INTO item (descricao, quantidade, id_unidade, id_categoria)
VALUES ('Arroz 5kg', 20, 2, 1); 

INSERT INTO item (descricao, quantidade, id_unidade, id_categoria)
VALUES ('Sabão líquido', 15, 3, 2); 

INSERT INTO item (descricao, quantidade, id_unidade, id_categoria)
VALUES ('Papel higiênico', 50, 1, 3); 


SELECT * FROM item