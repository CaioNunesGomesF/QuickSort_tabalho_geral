package application;

import entities.ordenacao.QuickSortImplementacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        QuickSortImplementacao quickSort = new QuickSortImplementacao();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date[] datas = {
                    sdf.parse("25/11/2022"),
                    sdf.parse("01/01/2028"),
                    sdf.parse("15/07/2023"),
                    sdf.parse("12/12/1960"),
                    sdf.parse("20/06/1470"),
                    sdf.parse("12/06/1002")
            };

            System.out.println("Array antes da ordenação (Date):");
            for (Date data : datas) {
                System.out.println(sdf.format(data));
            }

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
