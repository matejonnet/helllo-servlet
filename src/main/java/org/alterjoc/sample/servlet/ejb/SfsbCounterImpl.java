/**
 *
 */
package org.alterjoc.sample.servlet.ejb;


import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;

/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
@Stateful
@SessionScoped
//@Clustered
public class SfsbCounterImpl implements SfsbCounter
{
	int current = 0;

	public int increment(int amount){
		current += amount;
		return current;
	}

	@Remove
	public void remove() {
		current = 0;
	}

}
