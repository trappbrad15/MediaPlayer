package android.widget;

public abstract interface SectionIndexer
{
  public abstract Object[] getSections();

  public abstract int getPositionForSection(int paramInt);

  public abstract int getSectionForPosition(int paramInt);
}

/* Location:           C:\Users\Brad\Downloads\adt-bundle-windows-x86_64-20130717\sdk\platforms\android-18\android.jar
 * Qualified Name:     android.widget.SectionIndexer
 * JD-Core Version:    0.6.2
 */