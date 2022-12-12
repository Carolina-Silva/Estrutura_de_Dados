#exemplo feito pensando em grafo direcionado não valorado
class Grafo:
    def __init__ (self, vertices):
        self.vertices = vertices
        self.grafo = [[] for i in range(self.vertices)]

    def add_aresta(self, u, v):
        self.grafo[u-1].append(v) #add a aresta que vai de u para v
        
    def mostrar_lista(self):
        for i in range(self.vertices):
            print(f'{i+1}:', end='  ')
            for j in self.grafo[i]:
                print(f'{j}  ->', end='  ')
            print('') #print p/ pular linha


#criando exemplo:
g = Grafo(4)
g.add_aresta(1,2)
g.add_aresta(2,3)
g.add_aresta(2,4)
g.add_aresta(3,1)
g.add_aresta(3,4)

g.mostrar_lista()

