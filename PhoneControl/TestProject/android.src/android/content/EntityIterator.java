package android.content;

import java.util.Iterator;

public abstract interface EntityIterator extends Iterator<Entity>
{
  public abstract void reset();

  public abstract void close();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.content.EntityIterator
 * JD-Core Version:    0.6.2
 */