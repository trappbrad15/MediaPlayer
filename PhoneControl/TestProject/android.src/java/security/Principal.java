package java.security;

public abstract interface Principal
{
  public abstract boolean equals(Object paramObject);

  public abstract String getName();

  public abstract int hashCode();

  public abstract String toString();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.Principal
 * JD-Core Version:    0.6.2
 */