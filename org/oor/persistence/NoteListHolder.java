package org.oor.persistence;


/**
* org/oor/persistence/NoteListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/Ontology.idl
* Dienstag, 30. Juli 2013 15:56 Uhr MESZ
*/

public final class NoteListHolder implements org.omg.CORBA.portable.Streamable
{
  public org.oor.persistence.Note value[] = null;

  public NoteListHolder ()
  {
  }

  public NoteListHolder (org.oor.persistence.Note[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.oor.persistence.NoteListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.oor.persistence.NoteListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.oor.persistence.NoteListHelper.type ();
  }

}
