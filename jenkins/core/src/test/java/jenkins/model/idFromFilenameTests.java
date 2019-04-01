package jenkins.model;

import jenkins.model.IdStrategy;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.EmptyStackException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static.junit.Assert.assertTrue;

import jenkins.model.IdStrategy;

@RunWith(Theories.class)

public class idFromFilenameTest
{
	@Test
	public void testHexToString()
	{
		IdStrategy = new IdStrategy.CaseSensative();
		String input  ="$0068$0065$006c$006c$006f";
		String output = strategy.idFromFile(input);
		assertEquals("hello", output);	
	}
        @Test
	public void testHexToStringBounds()
	{
		IdStrategy = new IdStrategy.CaseSensative();
		String input  ="watch that scen$00";
		String output = strategy.idFromFile(input);
		assertEquals("watch the scen", output);
	}
}
