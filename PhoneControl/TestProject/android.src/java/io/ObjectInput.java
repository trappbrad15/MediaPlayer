package java.io;

public abstract interface ObjectInput extends DataInput
{
  public abstract int available()
    throws IOException;

  public abstract void close()
    throws IOException;

  public abstract int read()
    throws IOException;

  public abstract int read(byte[] paramArrayOfByte)
    throws IOException;

  public abstract int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;

  public abstract Object readObject()
    throws ClassNotFoundException, IOException;

  public abstract long skip(long paramLong)
    throws IOException;
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.io.ObjectInput
 * JD-Core Version:    0.6.2
 */