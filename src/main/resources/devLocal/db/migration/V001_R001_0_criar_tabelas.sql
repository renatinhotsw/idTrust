CREATE TABLE TB_TEST(
  test_id serial PRIMARY KEY NOT NULL,
  nome varchar(100),
  ativo boolean default true
);
