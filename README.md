# Exercicio-Teste
O objetivo desse teste é ler dois arquivos .csv (modelos e carros) e gerar um relatório conforme solicitado.
 
1. Um posto de gasolina com duas bombas abastecedoras independentes, uma de álcool e outra de gasolina, recebe veículos de diversas naturezas. Os veículos adentram ao posto em fila única, sendo direcionados para filas individuais das bombas de abastecimento. Cada veículo pode utilizar um ou mais tipos de combustível. Crie um programa que simule o abastecimento de uma lista de veículos informados no arquivo fornecido, realizando o abastecimento apropriado de cada veículo. Pressupondo que todos os veículos estão com tanque vazio e os terão completados, e minimizando a razão preço/km rodado ao realizar o direcionamento dos veículos para as bombas, a saída deve ser produzida na ordem cronológica dos eventos, no seguinte formato (os valores são ilustrativos):
# Resultado da simulação
...
* [00:05] Veículo modelo FIAT-UNO, placa JGA-7389 foi abastecido com 48 litros de ETANOL.
* [00:10] Veículo modelo AUDI-A4, placa JGB-1234 foi abastecido com 65 litros de GASOLINA. ...

# Resumo da simulação
Total abastecido na bomba 1 (GASOLINA): 1517 litros

Total abastecido na bomba 2 (ETANOL): 1125 litros

Total geral abastecido de GASOLINA: 1517 litros

Total abastecido de ETANOL: 1125 litros

# Informações adicionais:

* O preço do litro da GASOLINA é R$ 2,90
* O preço do litro do ETANOL é R$ 2,27
* Velocidade de abastecimento da bomba de gasolina: 10 litros / minuto
* Velocidade de abastecimento da bomba de álcool: 12 litros /minuto
* Privilegie baixo acoplamento e alta coesão na solução proposta, minimizando impactos no caso de alterações nas definições do problema.
