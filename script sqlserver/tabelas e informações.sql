-- Tabela de unidades
CREATE TABLE unidade (
    id INT PRIMARY KEY IDENTITY(1,1),
    nome VARCHAR(50) NOT NULL
);

-- Tabela de categorias
CREATE TABLE categoria (
    id INT PRIMARY KEY IDENTITY(1,1),
    nome VARCHAR(50) NOT NULL
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
INSERT INTO unidade (nome) VALUES ('Unidade');
INSERT INTO unidade (nome) VALUES ('Caixa');
INSERT INTO unidade (nome) VALUES ('Litro');

-- Inserts de exemplo na tabela categoria
INSERT INTO categoria (nome) VALUES ('Alimento');
INSERT INTO categoria (nome) VALUES ('Limpeza');
INSERT INTO categoria (nome) VALUES ('Higiene');

-- Inserts de exemplo na tabela int (itens)
INSERT INTO item (descricao, quantidade, id_unidade, id_categoria)
VALUES ('Arroz 5kg', 20, 2, 1); -- Caixa, Alimento

INSERT INTO item (descricao, quantidade, id_unidade, id_categoria)
VALUES ('Sabão líquido', 15, 3, 2); -- Litro, Limpeza

INSERT INTO int (descricao, quantidade, id_unidade, id_categoria)
VALUES ('Papel higiênico', 50, 1, 3); -- Unidade, Higiene