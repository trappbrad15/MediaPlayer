package java.io;

public abstract interface ObjectOutput extends DataOutput
{
  public abstract void close()
    throws IOException;

  public abstract void flush()
    throws IOException;

  public abstract void write(byte[] paramArrayOfByte)
    throws IOException;

  public abstract void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;

  public abstract void write(int paramInt)
    throws IOException;

  public abstract void writeObject(Object paramObject)
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.ObjectOutput
 * JD-Core Version:    0.6.2
 */