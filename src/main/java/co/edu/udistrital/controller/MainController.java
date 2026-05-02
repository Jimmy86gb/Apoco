package co.edu.udistrital.controller;

import co.edu.udistrital.view.MainView;
import co.edu.udistrital.model.generator.DataGenerator;
import co.edu.udistrital.model.structures.*;
import co.edu.udistrital.model.entities.*;
        
public class MainController {
    private MainView view;
    private DataGenerator generator;
    public MainController(){
        view = new MainView();
        generator= new DataGenerator();
    }
    
    public void run(){
        System.out.println("hola");
        String option = "0";
        String msg = "";
        do{
            msg ="""
                 --MENU--
                 1.Problema Apoco
                 2.Problema Hampones
                 Elija una opcion:""";
            option = view.readData(msg);
            switch(option){
                case "1":
                    menuApoco();
                    
            }
        }while(!option.equals("6"));
    }
    
    private void menuApoco(){
        String msg;
        msg ="""
             --MENU APOCO--
             1.Elegir Numero de Corrupos y Generar Aleatoriamente
             2. Volver
             Elija una opcion:""";
        String option1 = view.readData(msg);
        switch(option1){
            case "1":
                SimpleList<Politician> listP = new SimpleList<>();
                msg ="""
                     --MENU APOCO--
                     Elija un tamaño de corruptos:""";
                int size = Integer.parseInt(view.readData(msg));
                listP = generator.generatePoliticians(size);
                Node<Politician> actual = listP.getHead();
                while(actual != null){
                    Politician p = actual.getData();
                    msg = "\n" + p.getName() + "  " + p.getMoneyToSteal();
                    view.showMsg(msg);
                    actual = actual.getNext();
                }
                msg ="""
                     --MENU APOCO--
                     1. Menor a Mayor en dinero
                     Elija un ordenamiento:""";
                String option2 = view.readData(msg);
                switch(option2){
                    case "1":
                        
                }

        }
    }
}
