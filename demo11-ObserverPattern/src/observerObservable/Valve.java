/**
 * Created on Sep 13, 2010
 *
 * Project: demo05-SimpleObserverObservablePattern 
 */
package observerObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * @author dwatson, kitty
 * @version 2.0
 */
public class Valve implements Observer
{
	//Constants
	private final int LOWER = 50;
	private final int UPPER = 100;
	
	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable p, Object arg)
	{
		Pipe pipe = (Pipe)p;
		
		if(pipe.getPressure() <= LOWER)
		{
			System.out.println("Closing valve, pressure at "+
					pipe.getPressure());
		}
		else if(pipe.getPressure() >= UPPER)
		{
			System.out.println("Opening valve, pressure at "+
					pipe.getPressure());
		}
		else
		{
			System.out.println("Pressure normal at "+
					pipe.getPressure());
		}
	}
}
