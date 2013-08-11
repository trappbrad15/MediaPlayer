package android.database;

public abstract interface CrossProcessCursor extends Cursor
{
  public abstract CursorWindow getWindow();

  public abstract void fillWindow(int paramInt, CursorWindow paramCursorWindow);

  public abstract boolean onMove(int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.CrossProcessCursor
 * JD-Core Version:    0.6.2
 */