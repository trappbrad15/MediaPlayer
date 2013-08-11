package java.lang.reflect;

public abstract interface TypeVariable<D extends GenericDeclaration> extends Type
{
  public abstract Type[] getBounds();

  public abstract D getGenericDeclaration();

  public abstract String getName();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.reflect.TypeVariable
 * JD-Core Version:    0.6.2
 */