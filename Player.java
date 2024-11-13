import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name = ""; 
  private double points;
  /* your code here - constructor(s) */ 
  public Player() {
    System.out.println("Enter Player Name: ");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();

    name = newName;
    System.out.println("Hello, " + name);
  }
  /* your code here - accessor(s) */ 
  public String getName()
  {
    return name;
  }
  
  public double getPoints()
  {
    return points;
  }
  /* your code here - mutator(s) */ 
  public void setName(String x)
  {
    name = x;
  }
}
