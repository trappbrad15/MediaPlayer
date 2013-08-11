package java.util.prefs;

import java.util.EventListener;

public abstract interface NodeChangeListener extends EventListener
{
  public abstract void childAdded(NodeChangeEvent paramNodeChangeEvent);

  public abstract void childRemoved(NodeChangeEvent paramNodeChangeEvent);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.prefs.NodeChangeListener
 * JD-Core Version:    0.6.2
 */