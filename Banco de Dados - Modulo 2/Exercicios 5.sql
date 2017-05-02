
SELECT a.IDAssociado,
	a.Nome,
	a.IDCidade,
	c.Nome as Nome_Cidade
	FROM associado a inner join Cidade c
	on c.IDCidade = a.IDCidade;

SELECT a.IDAssociado,
	a.Nome,
	a.IDCidade,
	c.Nome as Nome_Cidade
	FROM associado a right join Cidade c
	on c.IDCidade = a.IDCidade;

SELECT a.IDAssociado,
	a.Nome,
	a.IDCidade,
	c.Nome as Nome_Cidade
	FROM associado a left join Cidade c
	on c.IDCidade = a.IDCidade;

SELECT emp.IDEmpregado,
	emp.NomeEmpregado,
	emp.IDGerente From
	Empregado emp inner join Empregado ger
	on emp.IDGerente = ger.IDEmpregado

-- Confrontando estes dados podemos dizer que a empresa que esta fazendo esta obra fez algum tipo de superfaturamento
-- Note que a empresa cresceu 34 milhoes em apenas um ano
-- Os valores entre a oferta da empresa e a sugunda colocada na licita��o � mais de 10 vezes maior
-- A obra que era prevista para 5 meses levou 12 para ser concluida

Select IDCidade, Nome
From Cidade e
Where IDCidade IN (Select IDCidade
From Associado)
       d.IDDepartamento   as IDDepartamento,
       d.NomeDepartamento as Departamento,
	   e.salario
From Empregado e
Inner Join Departamento d
                on e.IDDepartamento = d.IDDepartamento
Order by e.salario DESC;