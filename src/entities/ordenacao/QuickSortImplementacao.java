package entities.ordenacao;

import java.util.Date;

public class QuickSortImplementacao implements OrdenarPerDate {

    @Override
    public void quickSort(Date[] datas, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(datas, esquerda, direita);
            quickSort(datas, esquerda, p - 1);  // Corrigido aqui: subtrair 1 do pivô
            quickSort(datas, p + 1, direita);
        }
    }

    @Override
    public int particao(Date[] datas, int esquerda, int direita) {
        Date pivo = datas[direita];
        int i = esquerda - 1;

        for (int j = esquerda; j < direita; j++) {
            // Comparar as datas
            if (datas[j].compareTo(pivo) > 0) {  // Alterado para ordem decrescente
                i++;
                trocar(datas, i, j);
            }
        }
        trocar(datas, i + 1, direita);
        return i + 1;
    }

    @Override
    public void trocar(Date[] vetor, int i, int j) {
        Date temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
