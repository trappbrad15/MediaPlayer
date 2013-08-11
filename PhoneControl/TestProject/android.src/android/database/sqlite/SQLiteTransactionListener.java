package android.database.sqlite;

public abstract interface SQLiteTransactionListener
{
  public abstract void onBegin();

  public abstract void onCommit();

  public abstract void onRollback();
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.database.sqlite.SQLiteTransactionListener
 * JD-Core Version:    0.6.2
 */