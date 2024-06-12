package hangMan;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

private static int startGame = 0;
private static int counterFalse = 0;
private static int trueI = 0;

public static void readyOrNot(){
	
	
		while(true) { 
		      String x = WordRanomizer.getWord().toLowerCase(); 
		      List<Character> array = new ArrayList<>(); 
		      for(int i = 0; i<x.length(); i++) { 
		       array.add(x.charAt(i)); 
		      } 
		      List<Character> arrayTest = new ArrayList<>(); 
		      for(int i = 0; i<array.size(); i++) { 
		       arrayTest.add('_'); 
		      } 
		      System.out.println("\n" + arrayTest); 
		      int counterFalse = 0; 
		      int trueI = 0; 
		      System.out.println("\tНачать игру - 1; Выйти - 2"); 
		      Scanner scan2 = new Scanner(System.in); 
		      int chose = scan2.nextInt(); 
		      if(chose==2)  
		       System.exit(0); 
		       
		      else if(chose==1) { 
		     while(counterFalse!=6) { 
		       
		      System.out.println("Введите букву"); 
		      Scanner scan = new Scanner(System.in); 
		      char input2 = scan.next().charAt(0); 
		      int index = -1; 
		      for(int j = 0; j<array.size(); j++) { 
		       if(array.get(j) == Character.toLowerCase(input2)) { 
		        index=j;}} 
		       
		      if(index==-1) { counterFalse++; DrawHangMan.drawHang(counterFalse); 
		      System.out.println("Число ошибок : " + counterFalse); } 
		      else { 
		      arrayTest.set(index, Character.toLowerCase(input2)); 
		      array.set(index, ' '); 
		      trueI++; 
		      DrawHangMan.drawHang(counterFalse); 
		      System.out.println(trueI + " " + arrayTest.size()); 
		        System.out.println(arrayTest);} 
		      if(trueI==arrayTest.size()) { 
		       counterFalse=6; 
		      } 
		     }   System.out.println("Правильный ответ: " + x); 
		      counterFalse = 0; 
		      trueI = 0; 
		       
		      for(int i = 0; i<x.length(); i++) { 
		       array.set(i, x.charAt(i)); 
		      } 
		      for(int i = 0; i<array.size(); i++) { 
		       arrayTest.set(i,'_'); 
		      } 
		      } }}}
		 



