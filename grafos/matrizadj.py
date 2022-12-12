class Grafo:


    def __init__(self, vertices):
        self.vertices = vertices
        self.grafo = [[0]*self.vertices for i in range(self.vertices)]

    def add_aresta(self, u, v):
        self.grafo[u-1][v-1] = 1  #trocar = por += ser for grafo múltiplo
        self.grafo[v-1][u-1] = 1 

    def mostra_matriz(self):
        print('A matriz de adjacências é:')
        for i in range(self.vertices):
            print(self.grafo[i])


g = Grafo(4)
g.add_aresta(1,2)
g.add_aresta(2,3)
g.add_aresta(2,4)
g.add_aresta(3,1)
g.add_aresta(3,4)

g.mostra_matriz()