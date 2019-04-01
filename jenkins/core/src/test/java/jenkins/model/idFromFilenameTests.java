package jenkins.model;

import jenkins.model.IdStrategy;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.EmptyStackException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static.junit.Assert.assertTrue;

public class IdFromFilenameTest
{
	@test
	public void testHexToStringBounds()
	{
		IdStrategy = new IdStrategy.CaseSensative();
		String input  ="watch that scen$00";
		String output = strategy.idFromFile(input);
		assertEquals("watch the scen", output);
	}



}
