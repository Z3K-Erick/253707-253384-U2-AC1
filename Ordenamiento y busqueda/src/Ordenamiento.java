public class Ordenamiento {

    public void quicksort(int[] listaOriginal, int inferior, int superior) {
        int i = inferior, j = superior;
        int central = (inferior + superior) / 2;
        double pivote = listaOriginal[central];

        do {
            while (listaOriginal[i] < pivote) i++;
            while (listaOriginal[j] > pivote) j--;
            
            if (i <= j) {
                intercambiar(listaOriginal, i, j);
                i++;
                j--;
            }
        } while (i <= j);

        if (inferior < j) {
            quicksort(listaOriginal, inferior, j);
        }
        if (i < superior) {
            quicksort(listaOriginal, i, superior);
        }
    }

    private void intercambiar(int[] listaOriginal, int i, int j) {
        int aux = listaOriginal[i];
        listaOriginal[i] = listaOriginal[j];
        listaOriginal[j] = aux;
    }
}