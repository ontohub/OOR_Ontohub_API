package org.ontohub.idl;


/**
* org/ontohub/idl/MetricsListHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from src/Ontology.idl
* Dienstag, 30. Juli 2013 15:12 Uhr MESZ
*/

abstract public class MetricsListHelper
{
  private static String  _id = "IDL:org/ontohub/idl/MetricsList:1.0";

  public static void insert (org.omg.CORBA.Any a, org.ontohub.idl.Metrics[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.ontohub.idl.Metrics[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.ontohub.idl.MetricsHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.ontohub.idl.MetricsListHelper.id (), "MetricsList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.ontohub.idl.Metrics[] read (org.omg.CORBA.portable.InputStream istream)
  {
    org.ontohub.idl.Metrics value[] = null;
    int _len0 = istream.read_long ();
    value = new org.ontohub.idl.Metrics[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = org.ontohub.idl.MetricsHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.ontohub.idl.Metrics[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      org.ontohub.idl.MetricsHelper.write (ostream, value[_i0]);
  }

}
