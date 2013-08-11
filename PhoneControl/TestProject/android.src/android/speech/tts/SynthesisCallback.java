package android.speech.tts;

public abstract interface SynthesisCallback
{
  public abstract int getMaxBufferSize();

  public abstract int start(int paramInt1, int paramInt2, int paramInt3);

  public abstract int audioAvailable(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract int done();

  public abstract void error();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.speech.tts.SynthesisCallback
 * JD-Core Version:    0.6.2
 */