package yyyy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
	
	public static void main(String[] args) {
		
		//Maze File Input
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter Your maze file : ");
		String filename = user_input.nextLine();
		user_input.close();
		
		//Importing Files
		File fd = new File(filename);
		Scanner sc = null;
		try {
			sc = new Scanner(fd);
		} catch (FileNotFoundException e) {
			System.out.println("File not found! Application terminated\n" + e.toString());
			return;
		}
		

		int width = 0, height = 0;
		Position srt_pos, end_pos;
		int[][] maze;
		
	    //Sorting Maze 
		width = sc.nextInt();
		height = sc.nextInt();
		srt_pos = new Position(sc.nextInt(), sc.nextInt());
		end_pos = new Position(sc.nextInt(), sc.nextInt());
		maze = new int[height][width];
		for(int i=0; i<height; i++)
			for(int j=0; j<width; j++)
				maze[i][j] = sc.nextInt();	
		sc.close();
		
		MazeSolve ms = new MazeSolve(maze, srt_pos, end_pos);
		
		//Call solver method to find a path through the maze
		char succ = ms.solver();
		ms.print_result();
		
		if(succ != 'X')
			System.out.println("Maze can not be solved.");
		else
			System.out.println("Maze solved hoia gasa.");
	}
}
