package org.ontohub.idl;

/**
* org/ontohub/idl/MetadatumHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/Ontology.idl
* Dienstag, 30. Juli 2013 15:12 Uhr MESZ
*/

public final class MetadatumHolder implements org.omg.CORBA.portable.Streamable
{
  public org.ontohub.idl.Metadatum value = null;

  public MetadatumHolder ()
  {
  }

  public MetadatumHolder (org.ontohub.idl.Metadatum initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.ontohub.idl.MetadatumHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.ontohub.idl.MetadatumHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.ontohub.idl.MetadatumHelper.type ();
  }

}
