package java.lang.reflect;

public abstract interface ParameterizedType extends Type
{
  public abstract Type[] getActualTypeArguments();

  public abstract Type getOwnerType();

  public abstract Type getRawType();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.reflect.ParameterizedType
 * JD-Core Version:    0.6.2
 */