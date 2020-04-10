package json.test;

import json.*;

import java.io.File;
import java.io.FileWriter;

public class JSONHarness
{
    public Test001 test001;

    public Test002 test002;

    public Test003 test003;

    public Test004 test004;

    public Test005 test005;

    public Test006 test006;

    //

    public static class Test001
    {
        public Test001() throws Exception
        {
            JSONDocument document;

            JSONRoot root;

            JSONElement tables, table01, table02, table03;

            JSONElement columns01, columns02, columns03;

            JSONElement data01, data02, data03;

            //

            document = new JSONDocument(root = new JSONRoot("database",new JSONNamespace("default"), new JSONAttribute("id", "company")));

            //

            tables = root.addElement(new JSONElement("tables"));

            //

            table01 = tables.addElement(new JSONElement("table"), new JSONAttribute("id", "table01"));

            table02 = tables.addElement(new JSONElement("table"), new JSONAttribute("id", "table02"));

            table03 = tables.addElement(new JSONElement("table"), new JSONAttribute("id", "table03"));

            //

            columns01 = table01.addElement(new JSONElement("columns"));

            columns02 = table02.addElement(new JSONElement("columns"));

            columns03 = table03.addElement(new JSONElement("columns"));

            //

            data01 = table01.addElement(new JSONElement("data"));

            data02 = table02.addElement(new JSONElement("data"));

            data03 = table03.addElement(new JSONElement("data"));

            //

            FileWriter writer;

            writer = new FileWriter(new File("C:\\Users\\Mr. Max Rupplin\\Desktop\\json\\output.json"));

            writer.write(document.toJSON());

            writer.flush();

            writer.close();

            writer = null;
        }
    }

    public static class Test002
    {
        public Test002() throws Exception
        {
            //TODO reimagined JSON; but why
        }
    }

    public static class Test003
    {
        public Test003() throws Exception
        {

        }
    }

    public static class Test004
    {
        public Test004() throws Exception
        {

        }
    }

    public static class Test005
    {
        public Test005() throws Exception
        {

        }
    }

    public static class Test006
    {
        public Test006() throws Exception
        {

        }
    }
}
