package br.com.fiap;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String dia = LocalDate.now().getDayOfWeek().equals(DayOfWeek.THURSDAY) ? "casa" : "fiap";

        EntityManagerFactory factory = Persistence.createEntityManagerFactory( dia );
        EntityManager manager = factory.createEntityManager();

        Sabor s1 = new Sabor();
        s1.setNome("Manjericão");
        s1.setDescrilcao("Maravilhoso manjericão plantado e colhido pelos mais belos agricultores do Alegrete");

        Produto produto = new Produto();
        produto.setNome( "Pizza" ).setPreco(69.99);
        produto.setSabor(s1);


        manager.getTransaction().begin();
        manager.persist( produto );
        manager.getTransaction().commit();
        manager.getTransaction().commit();

        factory.close();
        manager.close();

    }
}