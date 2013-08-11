package java.io;

public abstract interface Externalizable extends Serializable
{
  public abstract void readExternal(ObjectInput paramObjectInput)
    throws IOException, ClassNotFoundException;

  public abstract void writeExternal(ObjectOutput paramObjectOutput)
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.Externalizable
 * JD-Core Version:    0.6.2
 */