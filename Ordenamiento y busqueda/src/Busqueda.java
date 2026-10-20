public class Busqueda {

    public int binaria(int[] listaOriginal, int valorBuscado, int inferior, int superior) {
        if (inferior > superior) {
            return -1; // Retorna -1 si no se encuentra
        } else {
            int central = (inferior + superior) / 2;
            
            if (listaOriginal[central] == valorBuscado) {
                return central;
            } else if (listaOriginal[central] < valorBuscado) {
                return binaria(listaOriginal, valorBuscado, central + 1, superior);
            } else {
                return binaria(listaOriginal, valorBuscado, inferior, central - 1);
            }
        }
    }
}
