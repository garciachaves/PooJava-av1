# Atividade para a disciplina de POO com Java (AV1)

Este código, no primeiro bloco, implementa um simulador de um sensor de temperatura que gera aleatoriamente 24 leituras de temperatura, uma a cada 30 minutos. O valor da temperatura gerado aleatoriamente está no intervalo entre 15°C e 40°C.

As leituras de temperatura são armazenadas em uma matriz e, em seguida, a matriz é classificada em ordem crescente de temperatura. O resultado é um relatório que exibe as 24 leituras de temperatura em ordem crescente. O algoritmo de ordenação utilizado no código é uma implementação do algoritmo Bubble Sort, que percorre repetidamente a matriz e compara pares de elementos adjacentes, trocando-os de posição se eles estiverem na ordem errada. Esse processo é repetido até que a matriz esteja completamente ordenada. O Bubble Sort é um algoritmo simples, mas pode ser ineficiente em casos de grandes conjuntos de dados.

O código utiliza a classe Calendar para obter a hora atual do sistema, a classe Random para gerar valores aleatórios de temperatura e a classe SimpleDateFormat para formatar a data e hora da medição de temperatura. Além disso, é usado um loop for para percorrer a matriz e classificá-la em ordem crescente, e outro loop for para exibir o relatório de medições de temperatura.

Nos blocos abaixo é feito a simulação de Sensor de Unidade e de Gás Carbônico, seguindo a mesma lógica acima.
