package java.util.zip;

public abstract interface Checksum
{
  public abstract long getValue();

  public abstract void reset();

  public abstract void update(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract void update(int paramInt);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     java.util.zip.Checksum
 * JD-Core Version:    0.6.2
 */