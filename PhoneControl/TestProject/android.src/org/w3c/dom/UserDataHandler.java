package org.w3c.dom;

public abstract interface UserDataHandler
{
  public static final short NODE_CLONED = 1;
  public static final short NODE_IMPORTED = 2;
  public static final short NODE_DELETED = 3;
  public static final short NODE_RENAMED = 4;
  public static final short NODE_ADOPTED = 5;

  public abstract void handle(short paramShort, String paramString, Object paramObject, Node paramNode1, Node paramNode2);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     org.w3c.dom.UserDataHandler
 * JD-Core Version:    0.6.2
 */