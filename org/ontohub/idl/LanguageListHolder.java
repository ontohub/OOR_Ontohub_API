package org.ontohub.idl;


/**
* org/ontohub/idl/LanguageListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/Ontology.idl
* Dienstag, 30. Juli 2013 15:12 Uhr MESZ
*/

public final class LanguageListHolder implements org.omg.CORBA.portable.Streamable
{
  public org.ontohub.idl.Language value[] = null;

  public LanguageListHolder ()
  {
  }

  public LanguageListHolder (org.ontohub.idl.Language[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.ontohub.idl.LanguageListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.ontohub.idl.LanguageListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.ontohub.idl.LanguageListHelper.type ();
  }

}
