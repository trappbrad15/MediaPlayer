package javax.security.auth;

public abstract interface Destroyable
{
  public abstract void destroy()
    throws DestroyFailedException;

  public abstract boolean isDestroyed();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     javax.security.auth.Destroyable
 * JD-Core Version:    0.6.2
 */