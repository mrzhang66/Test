package LifeGame;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import LifeGame.World.CellStatus;

public class WorldTest {
	private static World world = new World(40,50);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRun() {
		int a;
		world.settriangle();
		world.run();
		if(world.currentGeneration[16][23]==CellStatus.Active)
			a=1;
		else a=0;
		assertEquals(1,a);
		//fail("Not yet implemented");
	}

	@Test
	public void testSettriangle() {
		int a;
		world.settriangle();
		//world.run();
		if(world.currentGeneration[12][23]==CellStatus.Active)
			a=1;
		else {a=0;}
		assertEquals(1,a);
		//fail("Not yet implemented");
	}

	@Test
	public void testSetword_three() {
		int a;
		world.setword_three();
		//world.run();
		if(world.currentGeneration[12][13]==CellStatus.Active)
			a=1;
		else a=0;
		assertEquals(1,a);
		//fail("Not yet implemented");
	}
@Test
    public void testevolve()
    {
	    int a;
	    world.currentGeneration[0][0]=CellStatus.Active;
	    world.currentGeneration[0][1]=CellStatus.Active;
	    world.currentGeneration[0][2]=CellStatus.Active;
	    world.currentGeneration[1][0]=CellStatus.Dead;
	    world.currentGeneration[1][1]=CellStatus.Active;
	    world.currentGeneration[1][2]=CellStatus.Dead;
	    world.currentGeneration[2][0]=CellStatus.Dead;
	    world.currentGeneration[2][1]=CellStatus.Dead;
	    world.currentGeneration[2][2]=CellStatus.Dead;
	    world.rows=3;
	    world.columns=3;
	    world.evolve(1,1);
	    if(world.nextGeneration[1][1]==CellStatus.Active)
	    	a=1;
	    else a=0;
	    assertEquals(1,a);
    }
}
    