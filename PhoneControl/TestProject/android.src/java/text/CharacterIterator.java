package java.text;

public abstract interface CharacterIterator extends Cloneable
{
  public static final char DONE = 'ğ¿¿';

  public abstract Object clone();

  public abstract char current();

  public abstract char first();

  public abstract int getBeginIndex();

  public abstract int getEndIndex();

  public abstract int getIndex();

  public abstract char last();

  public abstract char next();

  public abstract char previous();

  public abstract char setIndex(int paramInt);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.text.CharacterIterator
 * JD-Core Version:    0.6.2
 */