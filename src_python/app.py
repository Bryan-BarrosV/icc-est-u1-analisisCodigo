from benchmarking import Benchmarking
from metodosordenamiento import MetodoOrdenamiento
import matplotlib.pyplot as plt

if __name__ == "__main__":
    print("funciona")

    metodos = MetodoOrdenamiento()
    benchmark = Benchmarking()
    tamanios = [500, 1000, 2000]
    resultados = []

    for tam in tamanios:
        arreglo_base = benchmark.build_arreglo(tam)

        metodos_dict = {
            "burbuja": metodos.sortByBubble,
            "seleccion": metodos.sort_seleccion,
        }

        for nombre, metodo in metodos_dict.items():
            tiempo = benchmark.medir_tiempo(metodo, arreglo_base)  
            tuplaResultado = (tam, nombre, tiempo)
            resultados.append(tuplaResultado)

    for resultado in resultados:
        tam, nombre, tiempo = resultado
        print(f"Tamaño: {tam}, Método: {nombre}, Tiempo: {tiempo:.6f} segundos")

    tiempos_by_metodo = {
        "burbuja": [],
        "seleccion": [],
    }

    for tam, nombre, tiempo in resultados:
        tiempos_by_metodo[nombre].append(tiempo)

    plt.figure(figsize=(10, 6))

    for nombre, tiempos in tiempos_by_metodo.items():
        plt.plot(tamanios, tiempos, label=nombre, marker='o')

    plt.title("Comprativa métodos" \
    "Bryan Barros - 2025-07-05- 8:53 am")
    plt.get_current_fig_manager().set_window_title("Comprativa métodos" \
    "Bryan Barros - 2025-07-05- 8:53 am")
    plt.xlabel("Datos eje X")
    plt.ylabel("Datos eje Y")
    plt.legend()
    plt.grid(True)
    plt.show()
