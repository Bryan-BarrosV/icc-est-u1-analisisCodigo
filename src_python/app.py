from benchmarking import Benchmarking
from metodosordenamiento import MetodoOrdenamiento

if __name__ == "__main__":
    print("funciona")

    metodos = MetodoOrdenamiento()
    benchmark = Benchmarking()
    tam = 10000
    arreglo_base = benchmark.build_arreglo(tam)

    metodos_dict = {
        "burbuja": metodos.sortByBubble,
        "seleccion": metodos.sort_seleccion,
    }

    resultados = []
    for nombre, metodo in metodos_dict.items():
        tiempo = benchmark.medir_tiempo(metodo, arreglo_base)
        tuplaResultado = (tam, nombre, tiempo)
        resultados.append(tuplaResultado)

    for resultado in resultados:
        tam, nombre, tiempo = resultado
        print(f"Tamaño: {tam}, Método: {nombre}, Tiempo: {tiempo:.6f} segundos")


    #a =5
    #b=a
    #print(a)
    #print (b)
    #b= 2 *a
    #print(a)
    #print (b) variable metodos que se aun diccionario dos elemento s burbuja y seleccion 