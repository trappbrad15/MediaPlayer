package java.lang.annotation;

public abstract interface Annotation
{
  public abstract Class<? extends Annotation> annotationType();

  public abstract boolean equals(Object paramObject);

  public abstract int hashCode();

  public abstract String toString();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.lang.annotation.Annotation
 * JD-Core Version:    0.6.2
 */