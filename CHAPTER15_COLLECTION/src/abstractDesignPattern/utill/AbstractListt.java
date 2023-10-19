package abstractDesignPattern.utill;

import java.util.Collection;

public abstract class AbstractListt implements Listt {
	@Override
	public boolean addAll(Collection c)
	{
		return true;
	}
	@Override
	public int indexOf(Object obj)
	{
		return 0;
	}
	@Override
	public int lastIndexOf(Object obj)
	{
		throw new UnsupportedOperationException("Not supported yet"); //To change body of generated methods,choose Tools | Templates
	}
	@Override
	public boolean add(Object obj)
	{
		throw new UnsupportedOperationException("Not supported yet"); //To change body of generated methods,choose Tools | Templates
	}	
}
