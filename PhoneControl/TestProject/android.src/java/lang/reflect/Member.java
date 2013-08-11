package java.lang.reflect;

public abstract interface Member
{
  public static final int PUBLIC = 0;
  public static final int DECLARED = 1;

  public abstract Class<?> getDeclaringClass();

  public abstract int getModifiers();

  public abstract String getName();

  public abstract boolean isSynthetic();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.reflect.Member
 * JD-Core Version:    0.6.2
 */