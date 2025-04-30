import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado:
    // retornaba un arreglo vacio. Correcion (return arreglo.)
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado:
    // if (arreglo[i] "<" arreglo[j])
    // Correción:
    // if (arreglo[i] > arreglo[j])

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j =  i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado:
    //for (int j = 0; j < "n"; j++)
    // Correción:
    // for (int j = 0; j < "n-1"; j++)
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:
    // }
    // Correcion:
    // return arreglo;
    // }
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:
    // for (int j = i + 1; j < arreglo.length; j--), provoca que sea un bucle infinito
    // Correccion:
    // for (int j = i + 1; j < arreglo.length; "j++")

    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado:
    // int smallerNumber = arreglo[i];
    //            arreglo[indiceMinimo] = arreglo[i];
    //            arreglo[indiceMinimo] = smallerNumber;
    // Correcion:
    // Corregi
    //int smallerNumber = arreglo[i];
    //            arreglo[i] = arreglo[indiceMinimo];
    //            arreglo[indiceMinimo] = smallerNumber;

    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    // while (i > 0 && arreglo[i] < key)
    // Correción:
    // while (i >= 0 && arreglo[i] < key), permite que cuando entre en bucle tambien cuente el primer elemento

    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] < key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    //for (; condición; actualización)
    //El error fue usar el mismo j en los dos for, lo que provocaba que el valor se desordenara
    // Correccion:
    //while (i >= 0 && arreglo[i] > actual)
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            while (i >= 0 && arreglo[i] > actual) {
                arreglo[j + 1] = arreglo[j];
                i--;
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    // int i=j Comienza desde la posicion equivocada
    //-------------------------------------------
    //for (int j = 1; j < arreglo.length; j--)  Se mueve en la direccion equivocada
    //-------------------------------------------
    // while (i > 0 && arreglo[i] < key) No icluye el indice 0
    //-------------------------------------------
    //return new int[] { 15, 34, 1, 2, 5, 6, 7, 10 }; Devuelve un arreglo fijo , no el deseado
    // Correccion:
    // int i = j-1
    //-------------------------------------------
    //for (int j = 1; j < arreglo.length; j++)
    //-------------------------------------------
    // while (i >= 0 && arreglo[i] < key)
    //-------------------------------------------
    // return arreglo;

    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;  // Comenzamos desde el índice anterior
            while (i >= 0 && arreglo[i] < key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }

            arreglo[i + 1] = key;  // Insertamos el key en la posición correcta
        }

        return arreglo;  // Devolvemos el arreglo ordenado
    }
}
