/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task3artjomartjuhhin;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21Task3ArtjomArtjuhhin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println("Ведите имя: "); //Латиницей
    String name = scan.next();
    System.out.println("Ведите фамилию: "); //Латиницей
    String surname = scan.next();
    System.out.println("Введите личный код = ");
    String[] month = {"Января","Февраля","Марта","Апреля","Мая","Июня","Июля","Августа","Сентября","Октября","Ноября","Декабря"};
    String id = scan.next();
    
    String year = (id.substring(1, 3));
    String Month = (id.substring(3, 5));
    String day = (id.substring(5, 7));
    String first = (id.substring(0,1));
        
        String mon = (month[Integer.parseInt(Month)-1]);
        String years = " ";
        if(first.contains("3")){
            years = "19";
        }
        if(first.contains("4")){
            years = "19";
        }
        if(first.contains("5")){
            years = "20";
        }
        if(first.contains("6")){
            years = "20";
        }
        
        System.out.print(name+" " + surname +" ты родился ");
        System.out.printf("%s %s %s%s", day,mon,years,year + " года");
}
        // TODO code application logic here
        
    }
    

