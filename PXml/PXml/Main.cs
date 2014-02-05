using System;
using System.Xml;

namespace PXml
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			XmlTextWriter xmlTextWriter = new XmlTextWriter (Console.Out);
			xmlTextWriter.WriteStartDocument();
			
			xmlTextWriter.WriteStartElement("table");
			xmlTextWriter.WriteStartAttribute("name");
			xmlTextWriter.WriteString("articulo");
			xmlTextWriter.WriteEndAttribute();
			
			xmlTextWriter.WriteStartElement("articulo");
			
			xmlTextWriter.WriteStartElement("id");
			xmlTextWriter.WriteString("1");
			xmlTextWriter.WriteEndElement();
			
			xmlTextWriter.WriteStartElement("nombre");
			xmlTextWriter.WriteString("articulo uno");
			xmlTextWriter.WriteEndElement();			
			
			xmlTextWriter.WriteStartElement("precio");
			xmlTextWriter.WriteString("1.5");
			xmlTextWriter.WriteEndElement();
			
			xmlTextWriter.WriteStartElement("categoria");
			xmlTextWriter.WriteString("1");
			xmlTextWriter.WriteEndElement();
			
			xmlTextWriter.WriteEndElement(); //articulo
			
			xmlTextWriter.WriteEndElement(); //table
			
			
			xmlTextWriter.Close();
		}
	}
}
