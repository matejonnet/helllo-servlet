/**
 *
 */
package org.alterjoc.sample.servlet.ejb;


/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
public interface SfsbCounter
{

	public int increment(int amount);

	public void remove();

}
