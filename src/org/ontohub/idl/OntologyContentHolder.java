package org.ontohub.idl;

/**
* org/ontohub/idl/OntologyContentHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Ontology.idl
* Montag, 29. Juli 2013 16:07 Uhr MESZ
*/

public final class OntologyContentHolder implements org.omg.CORBA.portable.Streamable
{
  public org.ontohub.idl.OntologyContent value = null;

  public OntologyContentHolder ()
  {
  }

  public OntologyContentHolder (org.ontohub.idl.OntologyContent initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.ontohub.idl.OntologyContentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.ontohub.idl.OntologyContentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.ontohub.idl.OntologyContentHelper.type ();
  }

}
