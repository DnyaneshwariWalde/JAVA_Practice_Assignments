package Q1;
/*
 * 
 *Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar.
Override the play method inside all three classes printing a message 

“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 

You must not allow the user to declare an object of Instrument class.

Create an array of 10 Instruments.

Assign different type of instrument to Instrument reference.

Check for the polymorphic behavior of  play method.

Use the instanceof operator to print that which object stored at which index of instrument array.         
  

 */
public class Question1Main {

	public static void main(String[] args) {
		
		Instrument inst[] = new Instrument[10];
		inst[0] = new Piano();
		inst[1] = new Guitar();
		inst[2] = new Flute();
		inst[3] = new Piano();
		inst[4] = new Guitar();
		inst[5] = new Flute();
		inst[6] = new Piano();
		inst[7] = new Guitar();
		inst[8] = new Flute();
		inst[9] = new Piano();
		
		for(int i=0;i<inst.length;i++)
		{
			if(inst[i] instanceof Piano)
			{
				System.out.println("Yes,Its Piano");
				inst[i].Play();
			}
			if(inst[i] instanceof Guitar)
			{
				System.out.println("Yes,Its Guitar");
				inst[i].Play();
			}
			if(inst[i] instanceof Flute)
			{
				System.out.println("Yes,Its Flute");
				inst[i].Play();
			}
		}

		

	}

}
