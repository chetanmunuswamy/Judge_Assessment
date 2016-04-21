package judge;
import java.awt.geom.Point2D;
public class Second21 {
		public int solution(int X, int Y) 
		{
			Point2D diagonal; 
			double diagonalSteps;
			
			if(X == Y && X == 0 )return 0;
			
			if(Math.abs(X)< Math.abs(Y))
			{
				diagonal = new Point2D.Double(Y,Y);
			}
			else
			{
				diagonal = new Point2D.Double(X,X);
			}
			
			if(diagonal.getX()<0)
			{
				int distance1 = (int) diagonal.distance(-diagonal.getX(), diagonal.getY());
				diagonalSteps =  distance1 * (distance1 +1);
				
			}
			else
			{
				int distance1 = (int) diagonal.distance(diagonal.getX(), -diagonal.getY());
				diagonalSteps =  distance1 * (distance1 -1);
			}
			
			if(X < diagonal.getX())
			{
				int newDistance = (int) (diagonal.getX() - X);
				return (int) (diagonalSteps - newDistance);
			}
			else
			{
				int newDistance = (int) (diagonal.getY() - Y);
				return (int) (diagonalSteps + newDistance);
			}
			
		}
		public static void main(String args[])
		{
			long start = System.nanoTime();
			Second21 obj = new Second21();
			int answer = obj.solution(-20000, 20000);
			System.out.println(answer);
			System.out.print("Time :");
			System.out.println(System.nanoTime()- start);
		}
	}

