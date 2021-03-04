package application;



import java.text.ParseException;
import java.text.SimpleDateFormat;

import entity.Comment;
import entity.Post;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		/*
		 * Chat hardcode e uso de StringBuilder para formata��o de String grande
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Tenha uma boa viagem!");
		
		Comment c2 = new Comment("Uau isso � incr�vel!");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zel�ndia", "Vou visitar esse pa�s maravilhoso", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Boa noite");
		
		Comment c4 = new Comment("Que a for�a esteja com voc�");
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite senhores", "Te vejo amanh�", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(p2);
	}
	

}
