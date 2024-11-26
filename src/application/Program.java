package application;

import entities.ordenacao.QuickSortImplementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        QuickSortImplementacao quickSort = new QuickSortImplementacao();

        // Exemplo: Ordenando um array de datas em ordem decrescente
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date[] datas = {
                    sdf.parse("25/11/2024"),
                    sdf.parse("01/01/2023"),
                    sdf.parse("15/07/2022"),
                    sdf.parse("12/12/2023")
            };

            System.out.println("Array antes da ordenação (Date):");
            for (Date data : datas) {
                System.out.println(sdf.format(data));
            }

            // Ordenação em ordem decrescente (mais recente para mais antiga)
            quickSort.quickSort(datas, 0, datas.length - 1);

            System.out.println("\nArray após a ordenação (Date):");
            for (Date data : datas) {
                System.out.println(sdf.format(data));
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
