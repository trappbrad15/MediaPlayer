package java.security;

public abstract interface PrivilegedExceptionAction<T>
{
  public abstract T run()
    throws Exception;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.security.PrivilegedExceptionAction
 * JD-Core Version:    0.6.2
 */