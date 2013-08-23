package org.oor.persistence;


/**
* org/oor/persistence/NoteHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/Ontology.idl
* Dienstag, 30. Juli 2013 15:56 Uhr MESZ
*/

abstract public class NoteHelper
{
  private static String  _id = "IDL:org/oor/persistence/Note:1.0";

  public static void insert (org.omg.CORBA.Any a, org.oor.persistence.Note that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.oor.persistence.Note extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.oor.persistence.IriHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "iri",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.oor.persistence.IriHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "authorIri",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.oor.persistence.TextHelper.id (), "Text", _tcOf_members0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "authorName",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.oor.persistence.IriHelper.type ();
          _members0[3] = new org.omg.CORBA.StructMember (
            "entryIri",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (org.oor.persistence.TextHelper.id (), "Text", _tcOf_members0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "entryComment",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.oor.persistence.NoteHelper.id (), "Note", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.oor.persistence.Note read (org.omg.CORBA.portable.InputStream istream)
  {
    org.oor.persistence.Note value = new org.oor.persistence.Note ();
    value.iri = org.oor.persistence.IriHelper.read (istream);
    value.authorIri = org.oor.persistence.IriHelper.read (istream);
    value.authorName = istream.read_string ();
    value.entryIri = org.oor.persistence.IriHelper.read (istream);
    value.entryComment = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.oor.persistence.Note value)
  {
    org.oor.persistence.IriHelper.write (ostream, value.iri);
    org.oor.persistence.IriHelper.write (ostream, value.authorIri);
    ostream.write_string (value.authorName);
    org.oor.persistence.IriHelper.write (ostream, value.entryIri);
    ostream.write_string (value.entryComment);
  }

}
