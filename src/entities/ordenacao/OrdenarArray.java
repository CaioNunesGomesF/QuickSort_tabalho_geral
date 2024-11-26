package entities.ordenacao;

import java.util.Date;

public interface OrdenarArray {

    void quickSort(Date[] datas, int esquerda, int direita);

    int particao(Date[] datas, int esquerda, int direita);

    void trocar(Date[] vetor, int i, int j);
}
